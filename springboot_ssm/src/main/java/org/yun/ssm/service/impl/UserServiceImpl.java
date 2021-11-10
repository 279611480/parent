package org.yun.ssm.service.impl;

import cn.hutool.core.bean.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.yun.common.util.result.Result;
import org.yun.common.util.result.ResultCode;
import org.yun.ssm.dto.UserDTO;
import org.yun.ssm.mapper.UserMapper;
import org.yun.ssm.service.UserService;
import org.yun.ssm.vo.UserVO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName UserServiceImpl
 * @Author 芸
 * @Date 2020/7/14 14:25
 * @Description TODO
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    UserMapper userMapper;


    @Override
    public UserVO selectById(String id) {
//        if (StringUtils.isEmpty(id)) {
//            return new UserVO();
//        }
        return userMapper.selectById(id);
    }

    @Override
    public UserVO selectById2(String id) {
//        if (StringUtils.isEmpty(id)) {
//            return new UserVO();
//        }
        return userMapper.selectById2(id);
    }

    @Override
    @Transactional
    public void deleteById(String id) {
        userMapper.deleteById(id);
    }

    @Override
    @Transactional
    public void addOrUpdate(@RequestBody UserDTO dto) {
        //是否有该记录，根据主键判断处理
        UserVO userVO = userMapper.selectById2(dto.getId());

        if (BeanUtil.isEmpty(dto) || StringUtils.isEmpty(dto.getId())) {
            String uuid = UUID.randomUUID().toString().replace("-", "");
            userMapper.add(uuid, dto.getName(), dto.getAge());
        } else {
            userMapper.update(dto.getId(), dto.getName(), dto.getAge());
        }

    }

    @Override
    public List<UserVO> getAll(Result result) {
        List<UserVO> list = new ArrayList<>();
        try {
            list = userMapper.selectAll();
            result.setCode(ResultCode.SUCCESS.code());
            result.setMessage(ResultCode.SUCCESS.message());
            //result.setData(list);
        } catch (Exception e) {
            result.setCode(ResultCode.FAIL.code());
            result.setMessage("查询失败！" + e.getCause().getMessage());
        }
        return list;
    }
}

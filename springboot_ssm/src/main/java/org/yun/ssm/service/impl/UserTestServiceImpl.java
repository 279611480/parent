package org.yun.ssm.service.impl;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yun.ssm.dto.PageEntityDTO;
import org.yun.ssm.mapper.UserMapper;
import org.yun.ssm.mapper.UserTestMapper;
import org.yun.ssm.pojo.User;
import org.yun.ssm.service.UserTestService;

import java.util.List;

/**
 * @ClassName UserTestServiceImpl
 * @Description
 * @Autor 落笔丶
 * @Date 2020/11/2 23:04
 * @Tel 279611480@qq.com
 */
@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    UserTestMapper userTestMapper;

    @Override
    public User getUserById(@Param("id") String id) {
        return userTestMapper.getUserById(id);
    }

    @Override
    public List<User> getUsetList1() {
        return userTestMapper.getUserList1();
    }

    @Override
    public Page<User> getUserById2() {
        return userTestMapper.getUserList2();
    }
}

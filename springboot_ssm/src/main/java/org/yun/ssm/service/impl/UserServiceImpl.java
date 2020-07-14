package org.yun.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yun.ssm.mapper.UserMapper;
import org.yun.ssm.pojo.User;
import org.yun.ssm.service.UserService;

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
    public User selectById(String id) {
        return userMapper.selectById(id);
    }
}

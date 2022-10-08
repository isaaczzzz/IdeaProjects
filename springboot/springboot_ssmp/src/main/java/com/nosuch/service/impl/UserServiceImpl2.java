package com.nosuch.service.impl;

import com.nosuch.mapper.UserMapper;
import com.nosuch.pojo.User;
import com.nosuch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl2 implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public Boolean save(User user) {
        //影响行大于零，即执行成功
        return userMapper.insert(user) > 0;
    }
}

package com.nosuch.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nosuch.mapper.UserMapper;
import com.nosuch.pojo.User;
import com.nosuch.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

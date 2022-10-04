package com.nosuch.mapper;

import com.nosuch.pojo.User;

import java.util.List;

public interface userMapper {
    List<User> selectAll();

    User selectById(int id);
}

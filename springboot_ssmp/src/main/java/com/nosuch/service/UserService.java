package com.nosuch.service;

import com.nosuch.pojo.User;

public interface UserService {
    User getById(Integer id);
    Boolean save(User user);
}

package com.nosuch.controller;

import com.nosuch.pojo.User;
import com.nosuch.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("{id}")
    public User getById(@PathVariable Integer id) {
        return iUserService.getById(id);
    }

    @PostMapping
    public Boolean save(@RequestBody User user) {
        return iUserService.save(user);
    }
}

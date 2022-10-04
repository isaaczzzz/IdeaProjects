package com.nosuch.service;

import com.nosuch.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService iUserService;

    @Test
    void testGetById() {
        System.out.println(iUserService.getById(2));
    }

    @Test
    void testSave() {
        User user = new User();
        user.setUsername("AAA");
        user.setPassword("09876");
        user.setGender("男");
        user.setAddr("成都");
        iUserService.save(user);
    }
}

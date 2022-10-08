package com.nosuch.mapper;

import com.nosuch.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetById() {
        System.out.println(userMapper.selectById(1));
    }

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("AAA");
        user.setPassword("09876");
        user.setGender("男");
        user.setAddr("成都");
        userMapper.insert(user);
    }
}

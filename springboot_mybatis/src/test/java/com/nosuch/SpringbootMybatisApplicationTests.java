package com.nosuch;

import com.nosuch.dao.OwnerDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    private OwnerDao ownerDao;

    @Test
    void contextLoads() {
        System.out.println(ownerDao.getById(4));
    }

}

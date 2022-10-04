package com.nosuch;

import com.nosuch.dao.OwnerDao;
import com.nosuch.pojo.Owner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {
    @Autowired
    private OwnerDao ownerDao;

    @Test
    void contextLoads() {
        //System.out.println(ownerDao.selectById(4));
    }
    @Test
    void selectAll() {
        System.out.println(ownerDao.selectList(null));
    }

}

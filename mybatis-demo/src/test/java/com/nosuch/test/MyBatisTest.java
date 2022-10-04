package com.nosuch.test;

import com.nosuch.mapper.brandMapper;
import com.nosuch.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testSelectAll() throws IOException {
        //1. 获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取mapper接口代理对象
        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        //4. 执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {

        int id = 1;

        //1. 获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取mapper接口代理对象
        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        //4. 执行方法
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() throws IOException {

        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        //封装对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setBrandName(brandName);
        brand.setCompanyName(companyName);

        //1. 获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3. 获取mapper接口代理对象
        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        //4. 执行方法
        List<Brand> brands = brandMapper.selectByCondition(brand);
        System.out.println(brands);

        //5. 释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByConditionSingle() throws IOException {

        int status = 1;
        String companyName = "华为";
        String brandName = "华为";

        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";

        //封装对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        brand.setBrandName(brandName);
        //brand.setCompanyName(companyName);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        List<Brand> brands = brandMapper.selectByCondition(brand);
        System.out.println(brands);

        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {

        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;

        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setStatus(status);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //关闭事务，自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        brandMapper.add(brand);

        //提交事务
        //sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {

        int status = 1;
        String companyName = "波导手机";
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 200;
        int id = 5;

        Brand brand = new Brand();
        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);
//        brand.setStatus(status);
//        brand.setDescription(description);
//        brand.setOrdered(ordered);
        brand.setId(id);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //关闭事务，自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        int count = brandMapper.update(brand);
        System.out.println(count);

        //提交事务
        //sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws IOException {

        int id = 7;

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //关闭事务，自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        brandMapper.deleteById(id);

        sqlSession.close();
    }

    @Test
    public void testDeleteByIds() throws IOException {

        int[] ids = {5, 6};

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //关闭事务，自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        brandMapper brandMapper = sqlSession.getMapper(brandMapper.class);

        brandMapper.deleteByIds(ids);

        sqlSession.close();
    }
}

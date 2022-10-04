package com.nosuch.mapper;

import com.nosuch.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    /**
     * 添加用户数据
     * @param user
     */
    @Insert("insert into tb_user values (null, #{username}, #{password})")
    void add(User user);

    /**
     * 根据username查询用户
     * @param username
     * @return
     */
    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(@Param("username") String username);

    User select(@Param("username") String username, @Param("password") String password);
}

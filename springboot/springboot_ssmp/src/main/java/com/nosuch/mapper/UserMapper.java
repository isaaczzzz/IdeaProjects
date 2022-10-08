package com.nosuch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nosuch.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

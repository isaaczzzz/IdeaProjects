package com.nosuch.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nosuch.pojo.Owner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OwnerDao extends BaseMapper<Owner> {
}

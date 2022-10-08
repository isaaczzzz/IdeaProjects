package com.nosuch.dao;

import com.nosuch.pojo.Owner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OwnerDao {

    @Select("select * from owner where PersonID = #{PersonID}")
    public Owner getById(Integer PersonID);
}

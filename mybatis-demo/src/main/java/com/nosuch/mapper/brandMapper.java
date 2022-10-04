package com.nosuch.mapper;

import com.nosuch.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface brandMapper {
    List<Brand> selectAll();

    //查看详情
    Brand selectById(int id);

    //条件查询
    List<Brand> selectByCondition(Brand brand);

    //单条件查询
    List<Brand> selectByConditionSingle(Brand brand);

    //添加
    void add(Brand brand);

    //修改
    int update(Brand brand);

    //删除
    void deleteById(int id);

    //批量删除
    void deleteByIds(@Param("ids") int[] ids);
}

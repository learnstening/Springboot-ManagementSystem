package com.ning.layui.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryMapper {
    public String getCategoryById(@Param("id") Integer id);
}




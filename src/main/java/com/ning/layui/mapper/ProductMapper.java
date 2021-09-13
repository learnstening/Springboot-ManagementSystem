package com.ning.layui.mapper;

import com.ning.layui.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

@Repository
public interface ProductMapper {
    public ArrayList<Product> getAllProduct();
    public Integer getProductCount();

    //分页查询
    public ArrayList<Product> findByPager(@Param("page") Integer page, @Param("limit") Integer limit);
}

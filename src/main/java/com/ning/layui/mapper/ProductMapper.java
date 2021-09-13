package com.ning.layui.mapper;

import com.ning.layui.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductMapper {
    public ArrayList<Product> getAllProduct();
    public Integer getProductCount();
}

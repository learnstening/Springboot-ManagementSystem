package com.ning.layui.mapper;

import com.ning.layui.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductMapperTest {

    @Autowired
    private ProductMapper productMapper;


    @Test
    void findByPager() {
        ArrayList<Product> list = productMapper.findByPager(0, 2);
        System.out.println(list);
    }
}
package com.ning.layui.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductMapperTest {

    @Autowired
    private ProductMapper mapper;

    @Test
    public void test1(){
        System.out.println(mapper.getAllProduct());
    }

    @Test
    public void test2(){
        System.out.println(mapper.getProductCount());
    }
}
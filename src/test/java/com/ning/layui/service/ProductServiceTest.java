package com.ning.layui.service;

import com.ning.layui.vo.DataVO;
import com.ning.layui.vo.ProductVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService service;

    @Test
    void findData() {
//        DataVO dataVO = service.findData();
        int i = 0;
    }
}
package com.ning.layui.controller;

import com.ning.layui.service.ProductService;
import com.ning.layui.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //restcontroller 只返回结果不返回视图
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public DataVO list(Integer page,Integer limit){
        return productService.findData(page, limit);
    }
}

package com.ning.layui.service;

import com.ning.layui.vo.DataVO;
import com.ning.layui.vo.ProductVO;

public interface ProductService {
    public DataVO<ProductVO> findData();
}

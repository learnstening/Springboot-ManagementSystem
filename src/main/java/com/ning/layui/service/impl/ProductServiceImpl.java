package com.ning.layui.service.impl;

import com.ning.layui.entity.Product;
import com.ning.layui.mapper.ProductCategoryMapper;
import com.ning.layui.mapper.ProductMapper;
import com.ning.layui.service.ProductService;
import com.ning.layui.vo.DataVO;
import com.ning.layui.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service("ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public DataVO<ProductVO> findData(Integer page, Integer limit) {

        //分页
        page = (page-1)*limit;
        ArrayList<Product> products = productMapper.findByPager(page, limit);


        DataVO dataVO = new DataVO();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(productMapper.getProductCount());
//        ArrayList<Product> allProduct = productMapper.getAllProduct();

        ArrayList<ProductVO> productVOS = new ArrayList<>();

        for (Product product : products) {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(product,productVO);
            productVO.setCategorylevelone(productCategoryMapper.getCategoryById(product.getCategoryleveloneId()));
            productVO.setCategoryleveltwo(productCategoryMapper.getCategoryById(product.getCategoryleveltwoId()));
            productVO.setCategorylevelthree(productCategoryMapper.getCategoryById(product.getCategorylevelthreeId()));
            productVOS.add(productVO);
        }

        dataVO.setData(productVOS);

        return dataVO;
    }
}

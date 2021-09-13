package com.ning.layui.entity;

import lombok.Data;

@Data
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private Integer categoryleveloneId;
    private Integer categoryleveltwoId;
    private Integer categorylevelthreeId;
    private String fileName;
}

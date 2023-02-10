package com.example.msy.dao;

import com.example.msy.entity.Products;

import java.util.List;

public interface ProductsRepo {

    Products getProductById(int productId);
    List<Products> getAllProducts();
    boolean addProduct(Products product);
    boolean updateProduct(Products product);
    boolean deleteProductById(int productId);

}

package com.scaler.productservicejan31capstone.services;

import com.scaler.productservicejan31capstone.models.Product;

import java.util.List;

public interface ProductService
{
    Product getProductById(long id);
    List<Product> getAllProducts();
}

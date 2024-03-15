package com.liquor_store.products.service;

import com.liquor_store.products.controller.dto.ProductDto;
import com.liquor_store.products.entity.Product;


public interface ProductService {
    Product createProduct(ProductDto productDto);
    Product get(Integer id);
    Product update(ProductDto productDto);
    void delete(Integer id);



}

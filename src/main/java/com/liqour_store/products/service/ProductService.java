package com.liqour_store.products.service;

import com.liqour_store.products.controller.dto.ProductDto;
import com.liqour_store.products.entity.Product;
import org.springframework.stereotype.Service;


public interface ProductService {
    Product createProduct(ProductDto productDto);
    Product get(Integer id);
    Product update(ProductDto productDto);
    void delete(Integer id);



}

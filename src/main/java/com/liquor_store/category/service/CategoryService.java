package com.liquor_store.category.service;

import com.liquor_store.category.controller.dto.CategoryDto;
import com.liquor_store.category.entity.Category;

public interface CategoryService {
    Category create(CategoryDto categoryDto);
    Category get(Integer id);
    Category update(CategoryDto categoryDto);
    void delete(Integer id);
}

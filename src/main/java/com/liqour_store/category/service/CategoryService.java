package com.liqour_store.category.service;

import com.liqour_store.category.controller.dto.CategoryDto;
import com.liqour_store.category.entity.Category;

public interface CategoryService {
    Category create(CategoryDto categoryDto);
    Category get(Integer id);
    Category update(CategoryDto categoryDto);
    void delete(Integer id);
}

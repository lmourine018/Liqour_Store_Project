package com.liqour_store.category.controller.assembler;

import com.liqour_store.category.controller.dto.CategoryDto;
import com.liqour_store.category.entity.Category;
import org.springframework.stereotype.Component;
@Component
public class CategoryAssembler {
    public CategoryDto toCategoryDto(Category from){
        CategoryDto to = new CategoryDto()
                .setId(from.getId())
                .setName(from.getName());
        return to;
    }
    public Category toCategory(CategoryDto from){
        Category to = new Category()
                .setId(from.getId())
                .setName(from.getName());
        return to;
    }
}

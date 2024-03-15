package com.liqour_store.category.service;

import com.liqour_store.category.controller.assembler.CategoryAssembler;
import com.liqour_store.category.controller.dto.CategoryDto;
import com.liqour_store.category.entity.Category;
import com.liqour_store.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryAssembler categoryAssembler;
    private final CategoryRepository categoryRepository;
    @Override
    public Category create(CategoryDto categoryDto) {
        Category category = new Category();
        return Optional.of(category)
                .map(entity-> categoryAssembler.toCategory(categoryDto))
                .map(categoryRepository::save)
                .orElseThrow(()-> new RuntimeException("category not created"));

    }

    @Override
    public Category get(Integer id) {
        return Optional.of(id)
                .flatMap(categoryRepository::findById)
                .orElseThrow(()-> new RuntimeException("category of id" +id + "not found"));
    }
    @Override
    public Category update(CategoryDto categoryDto) {
        Category category = get(categoryDto.getId());
        Optional.of(category)
                .map(entity-> categoryAssembler.toCategory(categoryDto))
                .map(categoryRepository::save)
                .orElseThrow(()-> new RuntimeException("category not updated"));
        return category;
    }
    @Override
    public void delete(Integer id) {
        Optional.of(id)
                .flatMap(categoryRepository::findById)
                .map(category ->{
                    categoryRepository.delete(category);
                    return category;
                });

    }
}

package com.liqour_store.category.controller;

import com.liqour_store.category.controller.assembler.CategoryAssembler;
import com.liqour_store.category.controller.dto.CategoryDto;
import com.liqour_store.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    private final CategoryAssembler categoryAssembler;

    @PostMapping
    public CategoryDto create(@RequestBody CategoryDto categoryDto){
        return categoryAssembler.toCategoryDto(categoryService.create(categoryDto));
    }
    @GetMapping("/{id}")
    public CategoryDto get(@PathVariable  Integer id){
        return categoryAssembler.toCategoryDto(categoryService.get(id));
    }
    @PutMapping("/{id}")
    public CategoryDto update(@RequestBody CategoryDto categoryDto){
        return categoryAssembler.toCategoryDto(categoryService.update(categoryDto));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
       categoryService.delete(id);
    }
}

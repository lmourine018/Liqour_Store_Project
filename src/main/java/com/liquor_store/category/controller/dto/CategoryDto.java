package com.liquor_store.category.controller.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
public class CategoryDto {
    private Integer id;
    @Column(name = "name")
    private String name;
}

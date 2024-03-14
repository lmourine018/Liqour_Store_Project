package com.liqour_store.category.controller.dto;

import lombok.Data;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
public class CategoryDto {
    private Integer id;
    private String name;
}

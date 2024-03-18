package com.liquor_store.products.controller.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class ProductDto {
    @Id
    private Integer id;
    private Integer categoryId;
    @Column(name = "name")
    private String name;
    private  Integer quantity;
    private String brand;
    private Double unit_cost;
    private String volume;
    private Double alcohol_percentage;
}

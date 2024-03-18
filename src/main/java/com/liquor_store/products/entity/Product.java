package com.liquor_store.products.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Table(name = "product_tb")
@Accessors(chain = true)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer categoryId;
    private String name;
    private String brand;
    private Double unit_cost;
    private String volume;
    private Double alcohol_percentage;
    private Integer quantity;

}

package com.liquor_store.products.controller.assembler;

import com.liquor_store.category.entity.Category;
import com.liquor_store.products.controller.dto.ProductDto;
import com.liquor_store.products.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ProductAssembler {

   public ProductDto toProductDto(Product from){
       ProductDto to = new ProductDto()
               .setId(from.getId())
               .setName(from.getName())
               .setAlcohol_percentage(from.getAlcohol_percentage())
               .setUnit_cost(from.getUnit_cost())
               .setBrand(from.getBrand())
               .setQuantity(from.getQuantity())
               .setVolume(from.getVolume());

       if (from.getCategory() != null){
           to.setId(from.getCategory().getId());
       }
return to;
    }
public Product toProduct(ProductDto from){
       Product to = new Product()
               .setId(from.getId())
               .setName(from.getName())
               .setUnit_cost(from.getUnit_cost())
               .setBrand(from.getBrand())
               .setVolume(from.getVolume())
               .setQuantity(from.getQuantity())
               .setAlcohol_percentage(from.getAlcohol_percentage());

       if (from.getCategoryId() != null){
           Category category = new Category();
           category.setId(from.getId());
           to.setCategory(category);
       }
       return to;
}
}

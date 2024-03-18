package com.liqour_store.products.controller.assembler;

import com.liqour_store.products.controller.dto.ProductDto;
import com.liqour_store.products.entity.Product;
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
               .setCategoryId(from.getCategoryId())
               .setQuantity(from.getQuantity())
               .setVolume(from.getVolume());
return to;
    }
public Product toProduct(ProductDto from){
       Product to = new Product()
               .setId(from.getId())
               .setName(from.getName())
               .setUnit_cost(from.getUnit_cost())
               .setBrand(from.getBrand())
               .setCategoryId(from.getCategoryId())
               .setVolume(from.getVolume())
               .setQuantity(from.getQuantity())
               .setAlcohol_percentage(from.getAlcohol_percentage());
       return to;
}
}

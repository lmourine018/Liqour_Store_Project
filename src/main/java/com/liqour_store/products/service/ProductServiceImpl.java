package com.liqour_store.products.service;

import com.liqour_store.products.controller.assembler.ProductAssembler;
import com.liqour_store.products.controller.dto.ProductDto;
import com.liqour_store.products.entity.Product;
import com.liqour_store.products.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductAssembler productAssembler;

    @Override
    @Transactional
    public Product createProduct(ProductDto productDto) {
        Product product = new Product();
        return Optional.of(product)
                .map(entity-> productAssembler.toProduct(productDto))
                .map(productRepository::save)
                .orElseThrow(()->new RuntimeException("Product was not created"));
    }
    @Override
    public Product get(Integer id) {
        Product product = Optional.of(id)
                .flatMap(productRepository::findById)
                .orElseThrow(()->new RuntimeException("Product of id "+ id + " is not found"));
        return product;
    }
    @Override
    public Product update(ProductDto productDto) {
        Product product = get(productDto.getId());
        return Optional.of(product)
                .map(entity-> productAssembler.toProduct(productDto))
                .map(productRepository::save)
                .orElseThrow(()-> new RuntimeException("product was not updated"));
    }

    @Override
    public void delete(Integer id) {
        Optional.of(id)
                .flatMap(productRepository::findById)
                .map(product -> {
                    productRepository.delete(product);
                    return product;
                })
                .orElseThrow(() -> new RuntimeException("No product with ID : " + id));

    }
}

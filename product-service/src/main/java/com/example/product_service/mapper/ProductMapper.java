package com.example.product_service.mapper;
import com.example.product_service.dto.ProductDTO;
import com.example.product_service.model.Products;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Products toEntity(ProductDTO productDTO) {
        return Products.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .quantity(productDTO.getQuantity())
                .price(productDTO.getPrice())
                .build();
    }

    public Products toDTO(Products product) {
        return Products.builder()
                .id(product.getId())
                .name(product.getName())
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .build();
    }
}

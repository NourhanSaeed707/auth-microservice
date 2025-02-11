package com.example.product_service.controller;
import com.example.product_service.dto.ProductDTO;
import com.example.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void create(@RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
    }
}

package com.example.product_service.service.Impl;
import com.example.product_service.dto.ProductDTO;
import com.example.product_service.mapper.ProductMapper;
import com.example.product_service.model.Products;
import com.example.product_service.repository.ProductRepository;
import com.example.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    @Override
    public void save(ProductDTO productDTO) {
        Products product = mapper.toEntity(productDTO);
        productRepository.save(product);
    }
}

package com.java.nutrisq.service;

import com.java.nutrisq.model.Product;
import com.java.nutrisq.model.User;
import com.java.nutrisq.repository.ProductRepository;
import com.java.nutrisq.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private static final int PAGE_SIZE = 3;
    private final ProductRepository productRepository;

    public List<Product> getProducts(int page) {
        return productRepository.findAllProducts(
                PageRequest.of(page, PAGE_SIZE)
        );
    }
}

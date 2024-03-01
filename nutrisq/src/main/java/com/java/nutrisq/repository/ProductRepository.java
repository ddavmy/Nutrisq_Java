package com.java.nutrisq.repository;

import com.java.nutrisq.model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT DISTINCT p FROM Product p")
    List<Product> findAllProducts(PageRequest pageRequest);
}

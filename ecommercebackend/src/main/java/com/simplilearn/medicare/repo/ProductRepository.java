package com.simplilearn.medicare.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.medicare.model.Product;
import com.simplilearn.medicare.model.User;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
}

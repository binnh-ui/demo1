package com.example.demo.services;

import com.example.demo.models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRespository extends JpaRepository<product, Integer> {
}

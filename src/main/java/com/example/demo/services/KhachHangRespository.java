package com.example.demo.services;

import com.example.demo.models.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRespository extends JpaRepository<product, Integer> {
}

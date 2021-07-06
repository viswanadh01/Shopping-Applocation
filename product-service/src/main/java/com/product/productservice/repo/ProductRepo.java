package com.product.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.productservice.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}

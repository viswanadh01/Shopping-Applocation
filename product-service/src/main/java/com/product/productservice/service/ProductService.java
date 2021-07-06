package com.product.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.product.productservice.entities.Product;
import com.product.productservice.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	
    public Product findProductById(int product_id) {
    	Optional<Product> product = repo.findById(product_id);
    	return product.get();    	
    }
    
    public ResponseEntity<Product> addProduct(Product product){
    	try {
    		Product prod = repo.save(new Product(product.getProduct_id(), product.getProduct_name(),
					product.getPrice()));
			return new ResponseEntity<>(prod, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	
}

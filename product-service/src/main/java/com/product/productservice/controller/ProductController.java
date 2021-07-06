package com.product.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.productservice.entities.Product;
import com.product.productservice.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	

    @GetMapping("/product/{product_id}")
    public Product findProductById(@PathVariable("product_id") int product_id) {
    	return service.findProductById(product_id);
    }
    
	@PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
		return service.addProduct(product);
	}


}

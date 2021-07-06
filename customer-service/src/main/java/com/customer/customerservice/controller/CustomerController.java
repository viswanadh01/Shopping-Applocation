package com.customer.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customerservice.entities.Customer;
import com.customer.customerservice.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable("id") int customerId) {
		return service.findCustomerById(customerId);
	}

	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
}

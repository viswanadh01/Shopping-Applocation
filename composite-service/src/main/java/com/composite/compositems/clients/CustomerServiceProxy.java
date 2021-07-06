package com.composite.compositems.clients;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.composite.compositems.model.customer_ms.Customer;

@FeignClient(name="customer-service")
public interface CustomerServiceProxy {
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer);
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable("id") int customerId);


}

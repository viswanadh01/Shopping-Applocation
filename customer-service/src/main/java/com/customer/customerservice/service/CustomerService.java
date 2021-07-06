package com.customer.customerservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.customer.customerservice.entities.Customer;
import com.customer.customerservice.repo.CustomerRepo;
@Service
public class CustomerService {


	@Autowired
	CustomerRepo repo;

	public ResponseEntity<Customer> findCustomerById(int customerId) {
		Optional<Customer> customer = repo.findById(customerId);
		if (customer.isPresent()) {
			return new ResponseEntity<>(customer.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Customer> saveCustomer(Customer customer) {
		try {
			Customer cust = repo.save(new Customer(customer.getCustomerId(), customer.getCustomerName(),
					customer.getEmail(), customer.getBillingAddress(), customer.getShippingAddress()));
			return new ResponseEntity<>(cust, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

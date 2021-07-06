package com.composite.compositems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.composite.compositems.clients.CartServiceProxy;
import com.composite.compositems.clients.CustomerServiceProxy;
import com.composite.compositems.entity.CustomerCartEmbeddable;
import com.composite.compositems.entity.CustomerCartEntity;
import com.composite.compositems.model.cart_ms.Cart;
import com.composite.compositems.model.customer_ms.Customer;
import com.composite.compositems.model.customer_ms.CustomerData;
import com.composite.compositems.repos.CustomerCartRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServiceProxy CustomerProxy;
	
	@Autowired
	private CartServiceProxy CartProxy;
	
	@Autowired
	private CustomerCartRepository ccRepo;
	@PostMapping("/customer")
	public CustomerData createCustomer(@RequestBody CustomerData customerdata)
	{
		ResponseEntity<Customer> customerResponse = CustomerProxy.saveCustomer(new Customer(customerdata.getCustomerName(), customerdata.getEmail(),customerdata.getShippingAddress(),customerdata.getBillingAddress()));
		Customer customer = customerResponse.getBody();
		ResponseEntity<Cart> cartResponse = CartProxy.saveCartItem(new Cart()); 
		Cart cart = cartResponse.getBody();
		CustomerCartEmbeddable cc=new CustomerCartEmbeddable(customer.getCustomerId(),cart.getCartId());
		CustomerCartEntity entity=new CustomerCartEntity(cc);
		ccRepo.save(entity);
		return new CustomerData(customer.getCustomerId(),customer.getCustomerName(),customer.getEmail(),customer.getBillingAddress(),customer.getShippingAddress(),cart.getCartId());
		
	}
	
	
	@GetMapping("/customer/{id}")
	public CustomerData findCustomerById(@PathVariable("id") int customerId)
	{
		ResponseEntity<Customer> customerResponse=CustomerProxy.findCustomerById(customerId);
		Customer customer = customerResponse.getBody();
		CustomerCartEntity cc= ccRepo.findByCustomerId(customerId).get(0);
		return new CustomerData(customer.getCustomerId(),customer.getCustomerName(),customer.getEmail(),customer.getBillingAddress(),customer.getShippingAddress(),cc.getId().getCartId());
	}

}

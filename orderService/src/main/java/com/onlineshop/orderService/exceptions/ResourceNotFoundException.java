package com.onlineshop.orderService.exceptions;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends Exception{

	public ResourceNotFoundException(String message) {
		super(message);
	}

}

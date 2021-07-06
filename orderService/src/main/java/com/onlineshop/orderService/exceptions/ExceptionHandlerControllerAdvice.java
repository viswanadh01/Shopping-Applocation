package com.onlineshop.orderService.exceptions;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody ExceptionResponse handleResourceNoFoundException(ResourceNotFoundException myexception,HttpServletRequest request)
	{
		ExceptionResponse response=new ExceptionResponse();
		response.setErrorMessage(myexception.getMessage());
		response.setRequestURI(request.getRequestURI());
		return response;		

	}
	
	
}

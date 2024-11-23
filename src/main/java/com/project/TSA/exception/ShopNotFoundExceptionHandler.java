package com.project.TSA.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShopNotFoundExceptionHandler 
{
	@ExceptionHandler(value = {ShopNotFoundException.class})
	public ResponseEntity<Object> getShopNotFoundMsg(ShopNotFoundException shopnotfoundexception)
	{
		ExceptionModel exceptionmodel=new ExceptionModel(shopnotfoundexception.getMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(exceptionmodel,HttpStatus.NOT_FOUND);
		
	}
}

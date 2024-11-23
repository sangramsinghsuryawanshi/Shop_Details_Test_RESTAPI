package com.project.TSA.exception;

import org.springframework.http.HttpStatus;

public class ExceptionModel 
{
	private final String msg;
	private final HttpStatus https;
	public ExceptionModel(String msg, HttpStatus https) {
		super();
		this.msg = msg;
		this.https = https;
	}
	public String getMsg() {
		return msg;
	}
	public HttpStatus getHttps() {
		return https;
	}
	
}

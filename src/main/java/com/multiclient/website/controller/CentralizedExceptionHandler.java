package com.multiclient.website.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.multiclient.website.exceptions.InvalidUserNameException;
import com.multiclient.website.exceptions.UserNotFoundException;

@RestControllerAdvice
public class CentralizedExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(UserNotFoundException.class)
	public String handleUserNotFound(UserNotFoundException e) {
		return e.getMessage();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidUserNameException.class)
	public String handleInvalidUserNameException(InvalidUserNameException e) {
		return e.getMessage();
	}

}

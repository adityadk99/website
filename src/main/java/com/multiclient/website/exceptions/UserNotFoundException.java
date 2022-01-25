package com.multiclient.website.exceptions;

public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

}

package com.multiclient.website.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.multiclient.website.entity.Registration;
import com.multiclient.website.request.AddRegistrationRequest;
import com.sun.istack.NotNull;

@Validated
public interface IRegistrationService {
	
	Registration addUser(@NotNull @Valid Registration registration);
	Registration findRegistrationById(@NotNull @Min(1)Long id);
	void deleteById(@NotNull @Min(1) Long id);
	List<Registration> findAll();
	

}

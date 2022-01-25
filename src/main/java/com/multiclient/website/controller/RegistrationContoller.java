package com.multiclient.website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.multiclient.website.entity.Registration;
import com.multiclient.website.request.AddRegistrationRequest;
import com.multiclient.website.service.RegistrationServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/registration") 
public class RegistrationContoller {
	
	@Autowired
	private RegistrationServiceImpl registrationServiceImpl;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public Registration addUser(@RequestBody Registration registration) {
		
		return registrationServiceImpl.addUser(registration);
	}
	
	@GetMapping("/{id}")
	public Registration findRegistrationById(@PathVariable Long id) {
		return registrationServiceImpl.findRegistrationById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRegistration(@PathVariable Long id) {
		registrationServiceImpl.deleteById(id);
		return "Deleted Registration details for id" + " " + id;
	}
	
	@GetMapping("/all")
	public List<Registration> findAll(){
		List<Registration> responce = registrationServiceImpl.findAll();
		return responce;
	}
	

}

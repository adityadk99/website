package com.multiclient.website.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiclient.website.entity.Address;
import com.multiclient.website.entity.Registration;
import com.multiclient.website.exceptions.UserNotFoundException;
import com.multiclient.website.repository.RegistrationRepository;
import com.multiclient.website.request.AddRegistrationRequest;

@Service("registrationService")
public class RegistrationServiceImpl implements IRegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Override
	public Registration addUser(Registration  registration2) throws UserNotFoundException {
		
		return registrationRepository.save(registration2);
		
	}

	@Override
	public Registration findRegistrationById(Long id) {
		
		Optional<Registration> optional = registrationRepository.findById(id);
		if(!optional.isPresent()) {
			throw new UserNotFoundException("user not found for id = "+ id);
		}
		Registration registration=optional.get();
		return registration;
	}
	
	public Registration newRegistration() {
		return newRegistration();
	}
	
	@Override
	public void deleteById(Long id) {
		
		Optional<Registration> optional = registrationRepository.findById(id);
		if(!optional.isPresent()) {
			throw new UserNotFoundException("user not found for id = "+ id);
		}
		registrationRepository.deleteById(id);
		
	}
	@Override
	public List<Registration> findAll(){
		List<Registration> list= registrationRepository.findAll();
		return list;
	}
	
	
}
	
	
	



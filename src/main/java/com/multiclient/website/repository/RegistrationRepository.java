package com.multiclient.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multiclient.website.entity.Registration;

@Repository("registrationRepository")
public interface RegistrationRepository extends JpaRepository<Registration, Long>{
	

}

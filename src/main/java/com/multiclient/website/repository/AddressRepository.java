package com.multiclient.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multiclient.website.entity.Address;

@Repository("addressRepository")
public interface AddressRepository extends JpaRepository<Address, Long>{
	

}

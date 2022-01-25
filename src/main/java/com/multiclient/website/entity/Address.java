package com.multiclient.website.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.multiclient.website.entity.Registration;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;
	@NotBlank
	@Length(min = 1)
	private String flatNo;
	@NotBlank
	@Length(min = 1)
	private String street;
	@NotBlank
	@Length(min = 1)
	private String area;
	@NotBlank
	@Length(min = 1)
	private String city;
	@Min(1)
    @NotNull
	private Long zipcode;
	@NotBlank
	@Length(min = 1)
	private String addressType;
	

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

//	public Registration getRegistration() {
//		return registration;
//	}
//
//	public void setRegistration(Registration registration) {
//		this.registration = registration;
//	}

}

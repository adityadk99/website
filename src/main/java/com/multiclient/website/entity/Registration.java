package com.multiclient.website.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@NotBlank
	@Length(min = 1)
	private String firstName;
	@NotBlank
	@Length(min = 1)
	private String lastName;
	@NotBlank
	@Length(min = 1)
	private String userName;
	@NotBlank
	@Length(min = 1)
	private String userPassword;
	@NotBlank
	@Length(min = 1)
	private String email;
	@Min(1)
	@NotNull
	private Long phoneNumber;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "unique_id")
	private Address address;
	/*
	 * @ManyToMany(fetch=FetchType.LAZY)
	 * 
	 * @JoinTable(name="user_roles", joinColumns=@JoinColumn(name="user_id"),
	 * inverseJoinColumns=@JoinColumn(name="role_id")) private Set<Role> roles = new
	 * HashSet<>();
	 */
	@NotBlank
	@Length(min = 1)
	private String userRole;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}

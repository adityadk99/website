package com.multiclient.website.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.multiclient.website.entity.Address;
import com.multiclient.website.entity.Registration;
import com.multiclient.website.exceptions.UserNotFoundException;
import com.multiclient.website.repository.RegistrationRepository;

@ExtendWith(MockitoExtension.class)
class RegistrationServiceImplUnitTest {

	private static final Address address = null;

	@Mock
	RegistrationRepository repository;

	@InjectMocks
	@Spy
	RegistrationServiceImpl service;

	@Test
	public void testFindRegistrationById() {
		long userId = 10;
		Registration registration = mock(Registration.class);
		Optional<Registration> optional = Optional.of(registration);
		when(repository.findById(userId)).thenReturn(optional);
		Registration result = service.findRegistrationById(userId);
		assertEquals(registration, result);
		verify(repository).findById(userId);
	}

	@Test
	public void testFindRegistrationById_2() {
		long userId = 10;
		Executable executable = () -> {
			Optional<Registration> optional = Optional.empty();
			when(repository.findById(userId)).thenReturn(optional);
			service.findRegistrationById(userId);
		};
		assertThrows(UserNotFoundException.class, executable);
	}

	@Test
	public void testaddUser() {

		Registration request = new Registration();
		Address address = new Address();
		address.setAddressId(2L);
		address.setFlatNo("8PN");
		address.setArea("chennai");
		address.setCity("Chennai");
		address.setStreet("patel");
		address.setZipcode(2349L);
		address.setAddressType("commercial");

		request.setUserId(1L);
		request.setUserName("adidas");
		request.setFirstName("adidas");
		request.setLastName("compony");
		request.setUserPassword("adidas@co");
		request.setEmail("adidas@co.in");
		request.setPhoneNumber(54546L);
		request.setAddress(address);

		Registration registration = mock(Registration.class);
		when(repository.save(request)).thenReturn(registration);
		Registration result = service.addUser(request);
		assertEquals(registration, result);
		verify(repository).save(request);

	}

}

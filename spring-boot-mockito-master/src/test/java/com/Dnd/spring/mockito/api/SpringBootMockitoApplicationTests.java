package com.Dnd.spring.mockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.DnD.spring.mockito.api.entity.UserRepository;
import com.DnD.spring.mockito.api.model.User;
import com.DnD.spring.mockito.api.service1.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(376, "Ashish", 22, "india"), new User(123, "Huy", 35, "UK")).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}

//	@Test
//	public void getUserbyAddressTest() {
//		String address = "Bangalore";
//		when(repository.findById(id))
//				.thenReturn(Stream.of(new User(376, "Danile", 31, "USA")).collect(Collectors.toList()));
//		assertEquals(1, service.getUserbyId(id).size());
//	}

	@Test
	public void saveUserTest() {
		User user = new User(999, "Pranya", 33, "Pune");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
		
	}

	@Test
	public void orderPlaceTest() {
		User user = new User(123, "Gautam", 23, "Mumbai");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
		
	}
//	@Test
//	public void deleteUserTest() {
//		User user = new User(999, "Pranya", 33, "Pune");
//		service.deleteUser(user);
//		verify(repository, times(1)).delete(user);
//	}

}

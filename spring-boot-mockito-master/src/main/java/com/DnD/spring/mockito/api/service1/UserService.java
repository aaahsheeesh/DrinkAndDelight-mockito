package com.DnD.spring.mockito.api.service1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DnD.spring.mockito.api.entity.UserRepository;
import com.DnD.spring.mockito.api.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public User addUser(User user) {
		return repository.save(user);
	}

	public List<User> getUsers() {
		List<User> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}

	public List<User> getUserbyId(String Id) {
		return repository.findByAddress(Id);
	}
	
	public boolean placeOrder() {
		return false;
		
	}

//	public void deleteUser(User user) {
//		repository.delete(user);
//	}
}

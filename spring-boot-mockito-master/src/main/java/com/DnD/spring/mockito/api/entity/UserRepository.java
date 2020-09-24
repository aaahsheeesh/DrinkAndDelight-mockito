package com.DnD.spring.mockito.api.entity;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.DnD.spring.mockito.api.model.User;

public interface UserRepository extends MongoRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}

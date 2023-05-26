package com.google.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.Exceptions.ResourseNotFoundException;
import com.google.entities.UserEntity;
import com.google.repository.UserRepository;
import com.google.services.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserEntity saveUser(UserEntity user) {
//		Integer randomUserId = UUID.randomUUID();
		return userRepo.save(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		
		return userRepo.findAll();
	}

	@Override
	public UserEntity getUser(Integer userId) {
		
		return userRepo.findById(userId).orElseThrow(() -> new ResourseNotFoundException("User with given id is not found on server! : " + userId ));
	}

}

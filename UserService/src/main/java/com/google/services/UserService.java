package com.google.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.entities.UserEntity;
import com.google.repository.UserRepository;


public interface UserService {
	
	
	
	
	UserEntity saveUser(UserEntity user);
	
	List<UserEntity> getAllUser();
	
	UserEntity getUser(Integer userId);
}

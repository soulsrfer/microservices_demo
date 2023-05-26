package com.google.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.entities.UserEntity;
import com.google.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
		UserEntity user1 = userService.saveUser(user);
//		System.out.println(user.getName());
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserEntity> getSinglelUser(@PathVariable Integer userId) {
			
		UserEntity user = userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping
	public ResponseEntity<List<UserEntity>> getAllUser() {
		List<UserEntity> allUser = userService.getAllUser();
		return ResponseEntity.ok(allUser);
	}
}

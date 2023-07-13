package com.wilson.dev.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.dev.domain.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u1 = new User("1", "Maria Brown", "maria@gmail.com");
		User u2 = new User("2", "Alex Green", "alex@gmail.com");
		return ResponseEntity.ok(Arrays.asList(u1, u2));
	}
	
}

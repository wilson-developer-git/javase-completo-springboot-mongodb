package com.wilson.dev.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilson.dev.dto.UserDTO;
import com.wilson.dev.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> listDTO = userService.findAll().stream().map(user -> new UserDTO(user))
				.collect(Collectors.toList());
		return ResponseEntity.ok(listDTO);
	}

}

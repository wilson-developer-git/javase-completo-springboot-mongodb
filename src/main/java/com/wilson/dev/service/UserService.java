package com.wilson.dev.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilson.dev.domain.User;
import com.wilson.dev.repository.UserRepository;
import com.wilson.dev.service.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> userOpt = userRepository.findById(id);
		if(!userOpt.isPresent()) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return userOpt.get();
	}
	
	
}

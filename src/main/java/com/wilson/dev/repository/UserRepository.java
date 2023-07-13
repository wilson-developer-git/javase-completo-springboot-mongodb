package com.wilson.dev.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wilson.dev.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}

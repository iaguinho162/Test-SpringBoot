package com.iaguinho162.workshomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.iaguinho162.workshomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
}

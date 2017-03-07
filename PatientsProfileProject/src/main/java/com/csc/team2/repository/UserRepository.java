package com.csc.team2.repository;

import org.springframework.data.repository.CrudRepository;

import com.csc.team2.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);
	
}

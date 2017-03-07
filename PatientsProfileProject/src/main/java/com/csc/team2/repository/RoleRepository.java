package com.csc.team2.repository;

import org.springframework.data.repository.CrudRepository;

import com.csc.team2.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

	Role findByName(String name);
	
}

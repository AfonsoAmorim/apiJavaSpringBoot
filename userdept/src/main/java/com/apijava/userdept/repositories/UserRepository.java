package com.apijava.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apijava.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
	
}

package com.darts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.darts.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUserName(String name);
	
}

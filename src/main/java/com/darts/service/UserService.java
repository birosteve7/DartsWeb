package com.darts.service;

import com.darts.domain.User;

public interface UserService {
	
	public String registerUser(User user);

	public User findByUsername(String name);	

}

package com.darts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darts.domain.User;
import com.darts.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepo;
	
	@Autowired
	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	 
	
	public User findUser(String name) {
		return userRepo.findByUserName(name);
	}
	
	public String registerUser(User userToRegister) {
		User userCheck = userRepo.findByUserName(userToRegister.getUserName());

		if (userCheck != null)
			return "alreadyExists";
		
		userRepo.save(userToRegister);
		return "ok";
	}
	

}

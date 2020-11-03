package com.darts.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.darts.domain.User;
import com.darts.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private UserRepository userRepository;

//	@Autowired
//    private PasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("UserCheck");
		User user = findByUsername(username);
		if (user == null) {
			log.info("UsernameNotFoundException");
			throw new UsernameNotFoundException(username);
		}
		log.info("(load)Passw: "+user.getPassword());
		return new UserDetailsImpl(user);
	}

	@Override
	public User findByUsername(String name) {
		return userRepository.findByUsername(name);
	}

	@Override
	public String registerUser(User userToRegister) {
		User userCheck = new User();
		userCheck = userRepository.findByUsername(userToRegister.getUsername());

		if (userCheck != null)
			return "alreadyExists";
//		String plainPassword = userToRegister.getPassword();
//		userToRegister.setPassword(passwordEncoder.encode(plainPassword));
//		log.info("Passw:"+userToRegister.getPassword());
		userRepository.save(userToRegister);
		
		return "ok";
	}
	
	@Override
	public long getId(String userName) {
		User user = userRepository.findByUsername(userName);
		return user.getId();
	}
}

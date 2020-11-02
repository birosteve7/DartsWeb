package com.darts.service;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private UserServiceImpl userServImpl;
	
	 @Override
	 public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		 String username = authentication.getName();
		 String password = authentication.getCredentials().toString();
		 UserDetails user = userServImpl.loadUserByUsername(authentication.getName());
		 log.info("Username_db:" +user.getUsername());
		 log.info("Password_db: "+user.getPassword());
		 log.info("Username_auth:" +username);
		 log.info("Password_auth: "+password);
		 if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			 return new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList());
		 	} else {
		 		throw new BadCredentialsException("Authentication failed");
		 	}
	 }
	 @Override
	 public boolean supports(Class aClass) {
	     return aClass.equals(UsernamePasswordAuthenticationToken.class);
	 }

}

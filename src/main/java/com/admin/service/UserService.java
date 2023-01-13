package com.admin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.admin.model.User;
import com.admin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}

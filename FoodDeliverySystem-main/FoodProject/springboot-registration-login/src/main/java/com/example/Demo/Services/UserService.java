package com.example.Demo.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.Demo.Dto.UserRegistrationDto;
import com.example.Demo.Model.User;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}

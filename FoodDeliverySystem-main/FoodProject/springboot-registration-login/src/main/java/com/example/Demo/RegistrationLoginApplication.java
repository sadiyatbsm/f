package com.example.Demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.Demo.Dto.UserRegistrationDto;
import com.example.Demo.Model.User;
import com.example.Demo.Repository.UserRepository;
import com.example.Demo.Services.UserService;
import com.example.Demo.Services.UserServiceImpl;

@SpringBootApplication
public class RegistrationLoginApplication {
	static UserService service;
	RegistrationLoginApplication(UserService service) {
		this.service = service;
	}
	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginApplication.class, args);
		service.save(new UserRegistrationDto("admin", "admin", "admin@admin.com", "123456"));
	}

}

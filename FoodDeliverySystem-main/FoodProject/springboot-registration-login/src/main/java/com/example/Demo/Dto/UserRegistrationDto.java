package com.example.Demo.Dto;

public class UserRegistrationDto {

	private String firstName;
	private String userRole;
	private String email;
	private String password;

	public UserRegistrationDto() {
		
	}
	
	public UserRegistrationDto(String firstName, String userRole, String email, String password) {
		super();
		this.firstName = firstName;
		this.userRole = userRole;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

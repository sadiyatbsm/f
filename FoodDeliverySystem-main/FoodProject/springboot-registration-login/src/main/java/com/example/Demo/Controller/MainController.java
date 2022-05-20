package com.example.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/Menu")
	public String Menu() {
		return "Menu";
	}
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/list-item")
	public String listItem() {
		return "list-item";
	}

}

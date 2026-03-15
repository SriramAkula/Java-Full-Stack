package com.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Security Actuator";
	}
	
	@GetMapping("/admin/dashboard")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminDashboard() {
		return "Welcome to Admin Dashboard";
	}
	
	@GetMapping("/user/dashboard")
	public String userDashboard() {
		return "Welcome to User Dashboard";
	}
}

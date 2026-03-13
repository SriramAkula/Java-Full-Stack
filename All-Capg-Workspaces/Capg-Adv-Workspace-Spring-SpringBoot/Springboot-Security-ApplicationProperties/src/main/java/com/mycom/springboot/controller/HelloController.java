package com.mycom.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello(HttpServletRequest request) {
		System.out.println(request.getSession().getId());
		return "Hello All..! Welcome to Spring Security..!";
	}
	
}






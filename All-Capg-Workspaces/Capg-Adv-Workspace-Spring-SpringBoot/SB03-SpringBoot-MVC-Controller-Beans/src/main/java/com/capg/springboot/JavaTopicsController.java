package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsController {
	
	@RequestMapping("login.spring")
	public String loginValid() {
		return "Welcome to SpringBoot Application";
	}
	
	@RequestMapping("/javaTopics")
	public List getAllTopics() {
		return Arrays.asList(new JavaTopics("SpringBoot","SpringMVC","SPring"),
							new JavaTopics("JPA","Hibernate","JDBC"),
							new JavaTopics("ReactJS","JavaScript","UI-Development")
				);
		
	}
	
}

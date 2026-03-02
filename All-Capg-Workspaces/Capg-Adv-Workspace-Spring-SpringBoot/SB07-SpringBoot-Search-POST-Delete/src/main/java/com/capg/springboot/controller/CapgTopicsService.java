package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CapgTopicsService {

	List<CapgTopics> topics = new ArrayList<>(Arrays.asList(
				new CapgTopics("Spring Boot","Spring MVC","SPRING"),
				new CapgTopics("J2SE Tech","JDBC","JAVA"),
				new CapgTopics("UI Technologies", "Angular","React")
			));

	public List<CapgTopics> getAllTopics() {
		return topics;
	}

	public void addTopic(CapgTopics topic) {
		topics.add(topic);
	}

	public CapgTopics getTopic(String id) {
		return (CapgTopics) topics.stream().filter(t -> ((CapgTopics) t).getId().equals(id)).findFirst().get();
	}

	public void deleteTopic(String id) {

		topics.removeIf(t -> ((CapgTopics) t).getId().equals(id));
	}

}

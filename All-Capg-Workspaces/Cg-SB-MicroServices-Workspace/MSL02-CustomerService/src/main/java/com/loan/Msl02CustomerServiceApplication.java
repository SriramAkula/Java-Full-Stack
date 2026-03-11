package com.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Msl02CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msl02CustomerServiceApplication.class, args);
	}

}

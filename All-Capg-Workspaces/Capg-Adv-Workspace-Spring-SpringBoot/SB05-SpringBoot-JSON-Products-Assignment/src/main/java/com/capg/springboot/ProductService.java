package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> products = Arrays.asList(new Product(1,"Watch", 650),
			new Product(2,"Laptop",65000),
			new Product(3, "TV", 25000)
			);
	public List<Product> getAllProducts() {
	
		return products;
	}
	
}

package com.capg.layers;

import java.util.Scanner;

public class ProductController {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Product ID: ");
			int pid = sc.nextInt();
			
			System.out.print("Enter Product Name: ");
			String pname=sc.next();
			
			System.out.print("Enter Product Price: ");
			double price=sc.nextDouble();
			
			ProductService productService = new ProductService();
			
			int i = productService.addProduct(pid, pname, price);
			
			System.out.println("ProductController return value for db: "+i);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

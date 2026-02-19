package com.java.m1;

import java.util.*;
import java.util.stream.*;


public class BakeMeAWish {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of cake orders to be added");
		int n= sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the cake order details (Order Id: CakeCost)");
		
		CakeOrder order = new CakeOrder();
		
		while(n-- > 0) {
			String[] details=sc.nextLine().split(":");
			
			order.addOrderDetails(details[0], Double.parseDouble(details[1]));
		}
		
		System.out.println("Enter the cost to search the cake orders");
		int cost = sc.nextInt();
		
		
		Map<String,Double> res = order.findOrdersAboveSpecifiedCost(cost);
		
		if(res.isEmpty()) {
			System.out.println("No cake orders found");
		}else {
			System.out.println("Cake Orders above specified cost");
			
			for(Map.Entry<String,Double> entry: res.entrySet()) {
				System.out.println("Order ID: "+entry.getKey() + ", Cake Cost: "+entry.getValue());
			}
		}
		
		
		
	}
}

class CakeOrder{
	
	private Map<String, Double> orderMap = new HashMap<>();
	
	
	public void addOrderDetails(String orderId, double cakeCost) {
		orderMap.put(orderId,cakeCost);
	}
	
	public Map<String, Double> findOrdersAboveSpecifiedCost(double cakeCost){
		
		return orderMap.entrySet().stream()
						.filter(obj -> obj.getValue() > cakeCost)
						.collect(Collectors.toMap(obj -> obj.getKey(), obj -> obj.getValue()));
		
		
	}
}

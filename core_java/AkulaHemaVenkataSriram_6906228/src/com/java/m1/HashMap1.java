package com.java.m1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;

public class HashMap1 {
	public static void main(String[] args) {
		
		Salary sal = new Salary();
		
		sal.empList.put("CEO",20000);
		sal.empList.put("Developer",5000);
		
		System.out.println(sal.totalSalary());
		sal.updateSalary("Developer",6000);
		
		System.out.println(sal.getSalary("Developer"));
		
	}
}


class Salary{
	Map<String,Integer> empList=new HashMap<>();
	String designation;
	Integer salary;
	
	public int totalSalary() {
		
//		int totalSal=0;
//		for(Map.Entry<String,Integer> entry:empList.entrySet()) {
//			totalSal+=entry.getValue();
//		}
		
//		int totalSal=empList.entrySet().stream()
//				.mapToInt(n->n.getValue())
//				.reduce(0, (a,n)-> a+n);
		
		int totalSal=empList.entrySet().stream()
				.mapToInt(n->n.getValue())
				.sum();
		
		return totalSal;
		
	}
	
	public String getSalary(String designation) {
		
//		Optional<Integer> res= empList.entrySet().stream()
//						.filter(obj -> obj.getKey().equals(designation))
//						.map(obj -> obj.getValue())
//						.reduce((a,b) -> a+b);
//		if(res.isPresent()) {
//			return ("Salary is "+res.get());
//		}
		
		
		
//		return "No designation match";
		int totalSal=0;
		for(Map.Entry<String,Integer> entry: empList.entrySet()) {
			if(entry.getKey().equals(designation)) {
				totalSal += entry.getValue(); 
			}
		}
		
		if(totalSal!=0) {
			return ("Salary is "+totalSal);
		}
		return "No designation match";
	}
	
	public void updateSalary(String designation, int newSalary) {
		if(empList.containsKey(designation)) {
			empList.put(designation, newSalary);
		}
	}
	
}










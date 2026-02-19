package com.java.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ExperienceJob {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,"Sriram",LocalDate.of(2022,06,22)));
		list.add(new Employee(2,"Kalyan",LocalDate.of(2023,04,8)));
		list.add(new Employee(3,"Billa",LocalDate.of(2020,12,31)));
		list.add(new Employee(4,"Nithin",LocalDate.of(2024,02,29)));
		list.add(new Employee(5,"Ranga",LocalDate.of(2025,9,17)));
		
		LocalDate date=LocalDate.now();
		
		for(Employee e: list) {
			if(ChronoUnit.YEARS.between(e.joiningDate, date)>3) {
				System.out.println(e);
			}
		}
	}
}

class Employee{
	int id;
	String name;
	LocalDate joiningDate;
	
	Employee(int id,String name,LocalDate joiningDate){
		this.id=id;
		this.name=name;
		this.joiningDate=joiningDate;
	}
	
	public String toString() {
		return "Emp id: "+id+" Name: "+name+" Joining Date: "+joiningDate;
	}
}
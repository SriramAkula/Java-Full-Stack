package com.java.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Launch {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); //Present date
		
		System.out.println(date);
		
		date = LocalDate.of(2025, 11, 30);
		
		System.out.println(date); //Custom date

		
		int year= date.getYear();
		int month= date.getMonthValue();
		int day= date.getDayOfMonth();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		
		DayOfWeek dayo=date.getDayOfWeek();
		System.out.println(dayo);

		date = date.plusDays(1);
		dayo=date.getDayOfWeek();
		
		System.out.println(dayo);

		
	}
}

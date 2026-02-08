package com.javafullstack.core.controlstatements.switch;

import java.util.Scanner;
class WorkShedule 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day of the week: ");
		int dayOfWeek=sc.nextInt();
		switch(dayOfWeek){
			case 1:
				System.out.println("Weekday");
				break;
			case 2:
				System.out.println("Weekday");
				break;
			case 3:
				System.out.println("Weekday");
				break;
			case 4:
				System.out.println("Weekday");
				break;
			case 5:
				System.out.println("Weekday");
				break;
			case 6:
				System.out.println("Weekend");
				break;
			case 7:
				System.out.println("Weekend");
				break;
			default:
				System.out.println("Invalid day of week");
				break;
						
		}
		
	}
}

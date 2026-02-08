package com.javafullstack.core.controlstatements.if-else;

import java.util.Scanner;
class OnlineCourseAccess 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fee Status (Paid/Unpaid): ");
		String isPaid=sc.next();
		System.out.print("Enter Scolarship Status (Active/Inactive): ");
		String hasScolarship=sc.next();
		System.out.print("Enter Course Status (Active/Inactive): ");
		String hasCourse=sc.next();
		
		if(hasCourse.equals("Active")){
			if(isPaid.equals("Paid") || hasScolarship.equals("Active")){
				System.out.println("Course Accessible");
			}else{
				System.out.println("Course Not Accessible");
			}
		}else{
			System.out.println("Course Not active");
		}
		
		
		

	}
}

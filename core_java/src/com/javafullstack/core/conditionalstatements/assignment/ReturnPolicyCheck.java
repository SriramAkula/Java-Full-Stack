package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class ReturnPolicyCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of days after delivery: ");
		int daysAfterDelivery = sc.nextInt();
		System.out.println((daysAfterDelivery>=0 && daysAfterDelivery<7) ? "Return Accepted" : "Return rejected");
	}
}

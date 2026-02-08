package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class DiscountEligibility 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cart Value: ");
		double cartValue=sc.nextDouble();
		System.out.println((cartValue > 2000) ? "Special Discount available" : "SD available for cart value more than 2000");
	}
}


// > is used. Another operator may cause the allowance of negative values.
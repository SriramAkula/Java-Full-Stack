package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class PriceDrop 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Last Viewed Price: ");
		double lastViewed=sc.nextDouble();
		System.out.print("Enter the Current Price: ");
		double currPrice=sc.nextDouble();
		System.out.println((currPrice<lastViewed) ? "Price Drop Alert" : "No Price Drop");
	}
}

// < is used for better detection.
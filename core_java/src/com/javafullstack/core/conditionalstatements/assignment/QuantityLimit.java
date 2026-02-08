package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class QuantityLimit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of orders: ");
		int orders=sc.nextInt();
		System.out.println((orders>5) ? "Cannot allow more than 5 orders" : "Order placed");
	}
}

// > because it checks for the value greater than 5.

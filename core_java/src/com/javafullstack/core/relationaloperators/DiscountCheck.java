package com.javafullstack.core.relationaloperators;


import java.util.Scanner;
class DiscountCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter true if has Premium else false:  ");
		boolean isPremUser = sc.nextBoolean();
		System.out.print("Enter Cart Value:  ");
		double cartValue =sc.nextDouble();
		boolean res= isPremUser || cartValue>5000;
		System.out.println(res ? "Discount Available" : "No Discount");
	}
}

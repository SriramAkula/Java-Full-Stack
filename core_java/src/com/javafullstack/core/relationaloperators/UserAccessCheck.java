package com.javafullstack.core.relationaloperators;


import java.util.Scanner;
class UserAccessCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.print("Enter true if is Banned else false:  ");
		boolean isBanned = sc.nextBoolean();
		boolean haveAccess = !isBanned && (age > 18);
		System.out.println( haveAccess ? "Access Available" : "Access Not Available");
	}
}

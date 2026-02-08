package com.javafullstack.core.relationaloperators;


import java.util.Scanner;
class  UserLoginCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String userName = sc.next();
		System.out.print("Enter password: ");
		String password = sc.next();
		System.out.print("Enter status Active or InActive: ");
		String status = sc.next();
		boolean res = (userName!="" && password!="") && status.equals("Active");
		String result = res ? "User Active" : "Username and Password can not be empty.";
		System.out.println(result);
	}
}

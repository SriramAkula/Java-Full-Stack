package com.javafullstack.core.relationaloperators;


import java.util.Scanner;
class TransatctionCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the acc balance:  ");
		double balance =sc.nextDouble();
		System.out.print("Enter true if has active acc else false:  ");
		boolean isActiveAcc =sc.nextBoolean();
		System.out.print("Enter true if acc frozen else false:  ");
		boolean isFrozenAcc =sc.nextBoolean();
		System.out.print("Enter req amt:  ");
		double reqAmt=sc.nextDouble();
		boolean isTransactionPermitted = (!isFrozenAcc && isActiveAcc )&& (balance > reqAmt);
		System.out.println(isTransactionPermitted ? "Transaction Allowed" : "Transaction Not Allowed");
	}
}

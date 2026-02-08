package com.javafullstack.core.methods.qusetions;

import java.util.Scanner;
class BankTransactionValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double bal=5000;
		System.out.print("Enter Withdraw amt: ");
		double amt=sc.nextDouble();
		String mess=checkTransation(bal,amt);
		System.out.println(mess);
	}
	public static String checkTransation(double bal,double amt){
		if(bal>=amt && amt>0){
			return "Amt can be withdrawable";
		}
		return "Invalid Amt range.";
	}
}

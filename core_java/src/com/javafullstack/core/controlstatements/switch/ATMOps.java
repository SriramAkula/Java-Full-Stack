package com.javafullstack.core.controlstatements.switch;

import java.util.Scanner;
class ATMOps 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long userAcc=123456789;
		double amt=0;
		double bal=5000;
		while(true){
			System.out.println("\nSelect one of the options\n1. Withdrawl\n2. Deposit\n3. Balance Enquiry\n4. Exit");
			System.out.print("Option: ");
			int option=sc.nextInt();
			switch(option){
				case 1:
					System.out.print("Enter Amt required to withdraw: ");
					amt=sc.nextDouble();
					if(amt>0 && amt<=bal){
						System.out.println(amt+" withdrawn");
						System.out.println("Remaining balance: "+(bal-amt));
					}else{
						System.out.println("Invalid amount entered");
					}
					break;
				case 2:
					System.out.print("Enter Account No: ");
					long accNo = sc.nextLong();
					if(accNo==userAcc){
						System.out.print("Enter Amt required to deposit: ");
						amt=sc.nextDouble();
						if(amt>0){
							System.out.println(amt+" deposited");
							System.out.println("Updated balance: "+(bal+amt));
						}else{
							System.out.println("Invalid amount entered");
						}
					}else{
						System.out.println("Invalid Account Number");
					}
					break;
				case 3:
					System.out.println("Current Balance: "+(bal));
					break;
				case 4:
					System.out.println("Thanking You For Using Our ATM!");
					return;
				default:
					System.out.println("Invalid Operation");
				break;
			}
		}	
	}
}

package com.javafullstack.core.controlstatements.if-else;

import java.util.Scanner;
class ShoppingCartValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Cart Value: ");
		double cartValue = sc.nextDouble();
		
		if(cartValue>0){
			System.out.print("Please Enter Delivery Address pincode: ");
			int pinCode=sc.nextInt();
			if(pinCode==123456 || pinCode==534301){
				System.out.println("Delivery Address pincode not delivarable");
			}else{
				System.out.println("Your checkout is allowed to "+pinCode);
			}
			
		}else{
			System.out.println("Cart is Empty!!!");
		}
		

	}
}

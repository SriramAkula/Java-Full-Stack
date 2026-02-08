package com.javafullstack.core.controlstatements.questions;

import java.util.Scanner;
class TelephoneBills 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of calls: ");
		int calls=sc.nextInt();
		double bPrice=200;
		double tPrice=200;
		if(calls>=0 && calls<=100){
			System.out.println("Your bill is "+bPrice);
		}else if(calls>0 && calls>100 && calls<=200){
			if(calls<=150){
				tPrice=bPrice+((calls-100)*0.60);

			}
			else if(calls<=200){
				tPrice=bPrice+((calls-150)*0.50)+((50)*0.60);

			}
		}else{
			tPrice=bPrice+((calls-200)*0.40)+((50)*0.50)+((50)*0.60);
		}
		System.out.println("Your bill is "+tPrice);
		

	}
}

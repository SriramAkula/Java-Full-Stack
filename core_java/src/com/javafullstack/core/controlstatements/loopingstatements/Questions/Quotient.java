package com.javafullstack.core.controlstatements.loopingstatements.Questions;


import java.util.Scanner;
class Quotient 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		while(m>=temp){
			c++;
			temp+=n;
		}
		System.out.println("Quotient of "+m+"/"+n+" is "+c);
	}
}
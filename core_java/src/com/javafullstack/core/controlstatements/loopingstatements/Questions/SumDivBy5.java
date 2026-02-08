package com.javafullstack.core.controlstatements.loopingstatements.Questions;


import java.util.Scanner;
class SumDivBy5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=m;i<n;i++){
			if(i%5==0){
				c+=i;
			}
		}
		System.out.println("Sum of num div by 5 are "+c);
	}
}
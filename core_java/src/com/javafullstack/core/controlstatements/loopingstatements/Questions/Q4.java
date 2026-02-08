package com.javafullstack.core.controlstatements.loopingstatements.Questions;


import java.util.Scanner;
class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		int m=sc.nextInt();
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		for(int i=m;i<n;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}	
		}
	}
}

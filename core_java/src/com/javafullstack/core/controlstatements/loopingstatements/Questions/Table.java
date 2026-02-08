package com.javafullstack.core.controlstatements.loopingstatements.Questions;


import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(num +" * "+i+" = "+(num*i) );
		}
		
	}
}

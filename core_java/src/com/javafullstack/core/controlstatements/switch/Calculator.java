package com.javafullstack.core.controlstatements.switch;

import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Calculator---------");
		int a,b;
		System.out.print("Enter the required operation \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n\nOperation: ");
		int op=sc.nextInt();
		switch(op){
			case 1:
				System.out.print("Enter 1st Operand: ");
				a=sc.nextInt();
				System.out.print("Enter 2nd Operand: ");
				b=sc.nextInt();
				System.out.println("Addition of 2 numbers: "+(a+b));
				break;
			case 2:
				System.out.print("Enter 1st Operand: ");
				a=sc.nextInt();
				System.out.print("Enter 2nd Operand: ");
				b=sc.nextInt();
				System.out.println("Subtraction of 2 numbers: "+(a-b));
				break;
			case 3:
				System.out.print("Enter 1st Operand: ");
				a=sc.nextInt();
				System.out.print("Enter 2nd Operand: ");
				b=sc.nextInt();
				System.out.println("Multiplication of 2 numbers: "+(a*b));
				break;
			case 4:
				System.out.print("Enter 1st Operand: ");
				a=sc.nextInt();
				System.out.print("Enter 2nd Operand: ");
				b=sc.nextInt();
				System.out.println("Division of 2 numbers: "+(a/b));
				break;
			default:
				System.out.println("Invalid Operation!");
		}
		
		

	}
}

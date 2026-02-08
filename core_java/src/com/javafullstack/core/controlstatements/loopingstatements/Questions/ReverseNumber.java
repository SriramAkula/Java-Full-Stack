package com.javafullstack.core.controlstatements.loopingstatements.Questions;


import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int num=sc.nextInt();
		int res=0;
		String result="";
		boolean flag=true;
		while(num>0){
			
			while(flag && num%10==0){
				System.out.print(0);
				num/=10;
			}
			int n=num%10;
			result=result+n;
			res=res*10+n;
			num/=10;
			flag=false;
		}
		
		System.out.println((res));
		//System.out.println("Reversed num: "+Integer.parseInt(result));
	}
}

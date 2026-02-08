package com.javafullstack.core.basicprograms;

import java.util.Scanner;
class DisariamNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 range: ");
		int a=sc.nextInt();
		System.out.print("Enter num2 range: ");
		int b=sc.nextInt();
		int c=0;
		for(int i=a;i<=b;i++){
			if(isDisariamNum(i)){
				System.out.print(i+" ");
				c++;
			}
		}
		System.out.println("\n"+c);

	}
	public static boolean isDisariamNum(int n){
		int temp=n;
		int len=0;
		double res=0;
		while(temp>0){
			len++;
			temp/=10;
		}
		temp=n;
		while(temp>0){
			int ntemp=temp%10;
			int d=1;
			for(int i=len;i>0;i--){
				d*=ntemp;
			}
			res=res+d;
			temp/=10;
			len--;
		}
		if(res==n){
			return true;
		}
		return false;
	}
}

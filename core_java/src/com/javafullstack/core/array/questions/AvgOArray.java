package com.javafullstack.core.array.questions;

import java.util.Scanner;
import java.util.Arrays;
class AvgOArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		
		}
		int c=0;
		int sum=0;
		for(int i=1;i<arr.length;i+=2){
			sum+=arr[i];
			c++;
		}
		System.out.print((double)sum/c);
		
	}
}
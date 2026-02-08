package com.javafullstack.core.array.questions;

import java.util.Scanner;
import java.util.Arrays;
class AvgFirstHalf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<(arr.length)/2;i++){
			sum+=arr[i];
		}
		System.out.println("Avg of 1st half: "+(double)sum/(arr.length/2));
		
		
	}
}
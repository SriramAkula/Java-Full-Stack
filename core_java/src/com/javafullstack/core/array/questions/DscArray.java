package com.javafullstack.core.array.questions;

import java.util.Scanner;
import java.util.Arrays;
class DscArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Element "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		sortArray(arr);
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
	public static void sortArray(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int mini=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[mini]){
					mini=j;
				}
			}
			if(mini!=i){
				int temp=arr[mini];
				arr[mini]=arr[i];
				arr[i]=temp;
			}
		}
	}
}

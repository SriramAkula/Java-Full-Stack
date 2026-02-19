package com.q2;

import java.util.*;

public class TransactionAnalysis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Set<Integer> set = new HashSet<>();
		
		int left=0;
		int sum=0;
		int res=0;
		for(int i=0;i<n;i++) {
			
				while(set.contains(arr[i])) {
					set.remove(arr[left]);
					sum-=arr[left];
					left++;
				}
			set.add(arr[i]);
			sum+=arr[i];
			res=Math.max(sum, res);
			
			
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
	}
}

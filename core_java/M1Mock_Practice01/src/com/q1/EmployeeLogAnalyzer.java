package com.q1;

import java.util.*;

public class EmployeeLogAnalyzer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String names[] = sc.nextLine().split(" ");
		
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<names.length;i++) {
			String s = names[i].toLowerCase();
			
			map.put(s,map.getOrDefault(s,0)+1);
			
			
		}
		
		String res = null;
		
		for(int i=0;i<names.length;i++) {
			String s = names[i].toLowerCase();
			
			if(map.get(s)==1) {
				res=names[i];
				break;
			}
			
			
		}
		
		if(res==null) {
			System.out.println(-1);
		}else {
			System.out.println(res);
		}
		
		
		
		
	}
}

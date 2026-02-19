package com.java.m1;

import java.util.Scanner;

public class UserInput3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String res="";
		
		for(Character ch : input.toCharArray()) {
			if(ch>='A' && ch<='Z') {
				res+=Character.toLowerCase(ch);
			}else if(ch>='a' && ch<='z') {
				res+=Character.toUpperCase(ch);
			}else {
				res+=ch;
			}
		}
		
		System.out.println(res);
		
	}
}

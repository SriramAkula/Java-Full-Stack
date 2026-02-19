package com.java.m1;

import java.util.Scanner;

public class UserInput2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split("\\s+");
		
		for(String ch: input) {
			System.out.println(ch);
		}
		
	}
}

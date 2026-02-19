package com.java.m1;

import java.util.Scanner;

public class StringMan1 {
	public static void main(String[] args) {
		
		
		Scanner sc =  new Scanner(System.in);
		
		String input=sc.nextLine();
		
		int vowels=0,consonants=0;
		
		for(Character ch : input.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				
				if("aeiouAEIOU".indexOf(ch)!=-1) {  //.indexOf(ch,5) checks for Capital vowels only
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		System.out.println(vowels);
		System.out.println(consonants);
		
		
		System.out.println(input.getClass().getSimpleName());

		
		
	}
}

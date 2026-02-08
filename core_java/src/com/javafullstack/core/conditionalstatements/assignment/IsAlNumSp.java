package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class IsAlNumSp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch=sc.next().charAt(0);
		boolean isAlpha= (ch>='A' && ch<='Z') || (ch>='a' && ch<='z');
		boolean isUpper= (ch>='A' && ch<='Z');
		boolean isLower= (ch>='a' && ch<='z');
		boolean isLVowel=(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
		boolean isUVowel=(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
		boolean isDigit=(ch>='0' && ch<='9');
		
		String result= isAlpha ? "Alphabet : " + (isUpper ? "Uppercase : " + (isUVowel ? "Vowel":"Consonant") :
						"LowerCase : " + (isLVowel ? "Vowel" : "Consonant")):
						isDigit ? "Digit" : "Special Character";
						
		
		String res=((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) ? 
			((ch<='Z') ? 
			((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') ? 
			"Alphabet : Upper Case : Vowel" : "Alphabet : UpperCase : Consonant") : 
			(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ? 
			"Alphabet : LowerCase : Vowel" : "Alphabet : LowerCase : Consonant") :
			(ch>='0' && ch<='9') ? "Digit" : "Special Character";
		
		String res1 = (ch>='a' && ch<='z') ? 
			((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ?
			"Lower Case vowel" : "Lower case consonant") : 
			(ch>='A' && ch<='Z') ? 
			((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ?
			"Upper Case vowel" : "Upper case consonant") : 
			(ch>='0' && ch<='9') ? "Number" : "Special char";
		System.out.println(result);
	}
}

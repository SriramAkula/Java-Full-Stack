package com.javafullstack.core.controlstatements.loopingstatements.Questions;


class Q2 
{
	public static void main(String[] args) 
	{
		long res=1;
		for(int i='A';i<='Z';i++){
			if(i%2!=0){
				res*=i;
			}
		}
		System.out.println(res);
	}
}

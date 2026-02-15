package com.javafullstack.core.conditionalstatements.assignment1;

class WishListLimit 
{
	public static void main(String[] args) 
	{
		
		int existsItems = 101;
		
		String res = (existsItems<= 100) ? "Can Add new items" : "Wish List Limit Exceeds";
		
		System.out.println(res);
		
	}
}

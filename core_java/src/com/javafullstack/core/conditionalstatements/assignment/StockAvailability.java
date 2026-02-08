package com.javafullstack.core.conditionalstatements.assignment;

import java.util.Scanner;
class StockAvailability 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter available stock: ");
		int availStock=sc.nextInt();
		System.out.println((availStock>0) ? "Added to Cart" : "No Stock Available");
	}
}

// >0 because if !=0 is used negative values will be resulted in available stock.
package com.javafullstack.core.controlstatements.loopingstatements;


class  InfiniteLoops
{
	public static void main(String[] args) 
	{
		boolean isFlag = true;
		do{
			System.out.println("Sorry");
			isFlag=false;
		}
		while(isFlag);
		
		do{
			System.out.println("Hello");
			//Inbuild Function
			System.exit(0);//Return Type int. We can use any integer inplace of 0;
			
			//if there is any statement after .exit it gives CTE (unreached statement error);
		}while(true);
		//This also unreachable;
	}
}

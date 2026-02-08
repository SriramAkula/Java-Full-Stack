package com.javafullstack.core.relationaloperators;


import java.util.Scanner;
class EmployeeCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter true if has ID Card else false:  ");
		boolean haveId =sc.nextBoolean();
		System.out.print("Enter true if is Permenant Employee else false:  ");
		boolean isPermenant =sc.nextBoolean();
		System.out.print("Enter true if is Contract Employee else false:  ");
		boolean isContract =sc.nextBoolean();
		System.out.print("Enter true if has Manager Approval else false:  ");
		boolean haveApproval =sc.nextBoolean();
		boolean res = haveId && (isPermenant || (isContract && haveApproval));
		System.out.println(res);
	}
}

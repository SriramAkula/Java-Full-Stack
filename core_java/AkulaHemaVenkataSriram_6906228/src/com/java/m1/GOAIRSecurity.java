package com.java.m1;

import java.util.*;


public class GOAIRSecurity {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		EntityUtility eu = new EntityUtility();
		
		while(n-- > 0) {
			String detail[] = sc.nextLine().split(":");
			
			try {
				if(eu.validateEmployeeId(detail[0]) && eu.validateDuration(Integer.parseInt(detail[2]))) {
					System.out.println("Valid entry details");
				}
				
			}catch(InvalidEntryException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}

class EntityUtility{
	
	public boolean validateEmployeeId(String employeeId) throws InvalidEntryException{
		
		String regex = "GOAIR/\\d{4}";
		
		if(!employeeId.matches(regex)) {
			throw new InvalidEntryException("Invalid entry details");
		}
		return true;
		
	}
	
	public boolean validateDuration(int duration) throws InvalidEntryException {
		if(duration>=1 && duration<=5) {
			return true;
		}
		throw new InvalidEntryException("Invalid entry details");
	}
	
}

class InvalidEntryException extends Exception{
	InvalidEntryException(String mess){
		super(mess);
	}
}
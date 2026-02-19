package com.springcore;

public class EmployeeServiceImpl implements EmployeeService{
	
	String eId;
	String eName;
	double salary;
	
	
	public EmployeeServiceImpl() {
		
	}
	
	public EmployeeServiceImpl(String eId, String eName, double salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}



	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void employeeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee Details:  ");
		
		System.out.println("Employee Id: "+eId);
		System.out.println("Employee Name: "+eName);
		System.out.println("Employee Salary: "+salary);

		
		
	}
	
	
}

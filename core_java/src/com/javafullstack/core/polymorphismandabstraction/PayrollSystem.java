package com.javafullstack.core.polymorphismandabstraction;


public class PayrollSystem {

    public static void main(String[] args){

        FullTimeEmployee11 obj1 = new FullTimeEmployee11("Alice","IT",50000,10000);

        System.out.println("FullTimeEmployee Pay: " + obj1.calculatePay());

        PartTimeEmployee11 obj2 = new PartTimeEmployee11("Bob","HR",200,20);

        System.out.println("PartTimeEmployee Pay: " + obj2.calculatePay());
    }
}
class Employee11{

    private String name;
    private double baseSalary;
    private String department;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBaseSalary(double sal){
        this.baseSalary = sal;
    }

    public double getSalary(){
        return baseSalary;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public double calculatePay(){
        return baseSalary;
    }
}
class FullTimeEmployee11 extends Employee11{

    private double bonus;

    FullTimeEmployee11(String name,String department,double baseSalary,double bonus){
        setName(name);
        setDepartment(department);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay(){
        return getSalary() + bonus;
    }
}
class PartTimeEmployee11 extends Employee11{

    private double hourlyRate;
    private double hoursWorked;

    PartTimeEmployee11(String name,String department,double hourlyRate,double hoursWorked){
        setName(name);
        setDepartment(department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }
}
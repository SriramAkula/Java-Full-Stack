package com.javafullstack.core.filehandling.projects.onlineshoppingorder;


public class Customer{
    private int customerId;
    Customer(int customerId){
        this.customerId=customerId;
    }

    public int getCustomerId(){
        return customerId;
    }
}
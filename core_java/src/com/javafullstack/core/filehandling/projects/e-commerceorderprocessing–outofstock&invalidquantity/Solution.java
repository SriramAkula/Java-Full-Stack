package com.javafullstack.core.filehandling.projects.e-commerceorderprocessing–outofstock&invalidquantity;



public class Solution {
    public static void main(String args[]){
        Product p1=new Product(201,"Laptop",5);
        OrderService os=new OrderService();

        try{
            os.placeOrder(p1,7);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
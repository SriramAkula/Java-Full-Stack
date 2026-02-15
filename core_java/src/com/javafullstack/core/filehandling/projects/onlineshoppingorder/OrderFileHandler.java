package com.javafullstack.core.filehandling.projects.OnlineShoppingOrder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;

public class OrderFileHandler{
    String filePath="orders.txt";

    public void saveOrder(Order order){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath,true))){
            
            bw.append(order.toString());
            bw.newLine();
            
        }catch(Exception e){
            System.out.println("Exception");
        }
    }

    public void readAllOrders(){
        int file;
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            file=br.read();
            while(file!=-1){
                System.out.print((char)file);
                file=br.read();
            }
        }catch(Exception e){
            System.out.println("Exception");
        }
    }

    public void getOrdersByCustomerId(int id){

        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){

            String line = "";
            while ((line = br.readLine())!=null){

                String val[] = line.split(",");

                if(Integer.parseInt(val[1])==(id)){
                    System.out.println(line);
                }
            }
        }catch(Exception e){
            System.out.println("Exception");
        }

    }

    public void getHighValueOrders(double minAmount){
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){

            String line = "";
            while ((line = br.readLine())!=null){

                String val[] = line.split(",");

                if(Double.parseDouble(val[4]) >= minAmount){
                    System.out.println(line);
                }
            }
        }catch(Exception e){
            System.out.println("Exception");
        }
    }


}
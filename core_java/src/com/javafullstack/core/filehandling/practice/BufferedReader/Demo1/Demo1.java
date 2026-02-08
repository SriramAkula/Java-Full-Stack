package com.javafullstack.core.filehandling.practice.BufferedReader.Demo1;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Demo1 {
    public static void main(String[] args) {
        String path="C:\\Users\\srira\\Desktop\\Java-Full-Stack\\Core_Java\\FileHandling\\BufferedWriter\\Demo1\\employees.txt";
        String line;
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            line=br.readLine();

            while(line!=null){
                System.out.println(line);
                line=br.readLine();
            }
            br.close();
        }catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}

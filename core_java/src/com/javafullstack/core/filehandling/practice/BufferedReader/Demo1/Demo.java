package com.javafullstack.core.filehandling.practice.BufferedReader.Demo1;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Demo {
    public static void main(String[] args) {
        String path="C:\\Users\\srira\\Desktop\\Java-Full-Stack\\Core_Java\\FileHandling\\BufferedWriter\\Demo1\\employees.txt";
        int file;
        try(BufferedReader br=new BufferedReader(new FileReader(path))){
            file=br.read();

            while(file!=-1){
                System.out.print((char)file);
                file=br.read();
            }
            br.close();
        }catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}

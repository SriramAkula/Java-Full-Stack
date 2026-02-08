package com.javafullstack.core.filehandling.projects.Activity1;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Solution {
    public static void main(String args[]){
        
        String path="sample.dat";
        File f=new File(path);
        try{
            f.createNewFile();
        }catch(Exception e){
            System.out.println("File already created");
        }

        Student s1=new Student(1,"Smith",76);
        Student s2=new Student(2,"Allen",65);

        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(path,true))){
        
            os.writeObject(s1);
            os.writeObject(s2);
        }catch(Exception e){
            System.out.println("error");
        }

        try(ObjectInputStream ios=new ObjectInputStream(new FileInputStream(path))){
            try{
                while(true){
                    Student s= (Student) ios.readObject();
                    System.out.println(s);
                }
            }catch(Exception e){
                
            }
        }catch(Exception e){
            System.out.println("Error");
        }
        
    }
}

package com.javafullstack.core.filehandling.practice.Demo3;



import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        
        File folder=new File("Outer/Inner");

        if(folder.mkdirs()){
            System.out.println("Folders created successfully");
        }else{
            System.out.println("Folders not created successfully");

        }

        File file=new File(folder,"abc.txt");

        if(folder.exists()){
            try{
                file.createNewFile();
                System.out.println("File abc.txt created");
            }catch(IOException e){
                System.out.println("File already exists");
            }
        }else{
            System.out.println("Folder not created");
        }

        File of=new File("Outer");
        if(of.renameTo(new File("Folder"))){
            System.out.println("Rename successful");
        }else{
            System.out.println("Rename not successful");

        }
    }
}

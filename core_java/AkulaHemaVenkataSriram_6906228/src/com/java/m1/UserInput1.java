// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package com.java.m1;

import java.util.*;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tasks = sc.nextInt();
        sc.nextLine();
        int ind=0;
        while(tasks>0){
            
            String details[] = sc.nextLine().split(" ");
            int id=Integer.parseInt(details[0]);
            String name = details[1];
            int age = Integer.parseInt(details[2]);
            double cgpa = Double.parseDouble(details[3]);
            
            
            String[] subjects = sc.nextLine().split(",");
            
            String[] marks1 = sc.nextLine().split(" ");
            
            Integer marks[]=new Integer[marks1.length];
            for(int i=0;i<subjects.length;i++){
                marks[i]=Integer.parseInt(marks1[i]);
            }
            
            System.out.println();
            
            System.out.println("Student "+(ind+1));
            System.out.println("id = "+id);
            System.out.println(name);
            System.out.println(age);
            System.out.println(cgpa);
            
            System.out.println(Arrays.asList(subjects));
            System.out.println(Arrays.asList(marks));

            

            ind++;
            tasks--;
        }
        
    }
}
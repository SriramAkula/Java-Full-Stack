package com.javafullstack.core.filehandling.projects.Activity1;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int marks;

    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public String toString(){
        return id+" "+name+" "+marks;
    }
}

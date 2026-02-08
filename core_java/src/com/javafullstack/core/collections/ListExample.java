package com.javafullstack.core.collections;


import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        List<Integer> al=new ArrayList<>();
        
        l.add(1);
        l.add(1, 2);
        l.addFirst(3);
        l.addLast(4);
        System.out.println(l);
        l.clear();
        System.out.println(l);
        
        al.add(1);
        al.add(1, 2);
        al.addFirst(3);
        al.addLast(4);
        
        l.addAll(al);
        l.add(6);
        System.out.println(l.contains(2));
        System.out.println(l.containsAll(al));
        System.out.println(l.equals(al));

        List<Integer> l2=l;
        System.out.println(l.equals(l2));

        l2.forEach((ele) -> {System.out.print(ele+" ");});
        System.out.println();

        System.out.println(l.get(3));
        
    }
}

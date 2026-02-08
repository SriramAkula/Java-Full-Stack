package com.javafullstack.core.collections;

import java.util.*;

public class Map_prac {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "sri");
        map.put(102, "ram");
        map.put(103, "sriram");

        System.out.println(map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

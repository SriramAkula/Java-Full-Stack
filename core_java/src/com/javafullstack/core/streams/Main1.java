package com.javafullstack.core.streams;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

        long count = nums.stream()
                         .filter(n -> n > 20)
                         .count();

        System.out.println(count);
    }
}

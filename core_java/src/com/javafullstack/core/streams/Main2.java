package com.javafullstack.core.streams;

import java.util.*;
import java.util.stream.*;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 6, 5);

        List<Integer> squares = nums.stream()
                                    .map(n -> n * n)
                                    .collect(Collectors.toList());

        System.out.println(squares);
    }
}

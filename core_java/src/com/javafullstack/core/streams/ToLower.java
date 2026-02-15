package com.javafullstack.core.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToLower {
	public static void main(String[] args) {
		
		String[] s= {"Hi","Hello"};
		
		List<String> list = new ArrayList<>(Arrays.asList(s));
		
		list=list.stream()
				.map(n -> n.toLowerCase())
				.toList();
		
		System.out.println(list);
		
	}
}

package com.javafullstack.core.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
	public static void main(String[] args) {
		
		String[] s= {"Hi","hello","hero"};
		
		List<String> list = new ArrayList<>(Arrays.asList(s));
		
		String s1=list.stream()
				.filter(n -> n.startsWith("h"))
				.findFirst().orElse("");
				
		
		System.out.println(s1);
		
	}
}

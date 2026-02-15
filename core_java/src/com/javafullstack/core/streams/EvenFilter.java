package com.javafullstack.core.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenFilter {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		list=list.subList(0, list.size());
		list.add(9);
//		System.out.println(list);
		
		list.stream()
				.filter(n -> n%2==0)
				.forEach(n -> System.out.print(n+" "));
		
		
	}
}

package com.java.m1;

import java.util.*;
import java.util.stream.Collectors;

public class SummarizingInt {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(5,3,2,5,1,2));
		
		IntSummaryStatistics i = list.stream()
										.collect(Collectors.summarizingInt(n -> n.intValue()));
		
		System.out.println(i.getSum());
		System.out.println(i.getCount());
		System.out.println(i.getMax());
		System.out.println(i.getAverage());
		System.out.println(i.getMin());

										
	}
}

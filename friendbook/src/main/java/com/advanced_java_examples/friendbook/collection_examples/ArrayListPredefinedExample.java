package com.advanced_java_examples.friendbook.collection_examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPredefinedExample {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Antony");
		names.add("Sagar");
		names.add("Prashanti");
		names.add("Antony");
		names.add("Sagar");
		names.add("Prashanti");
		
		System.out.println(names);
		names.clear();
		System.out.println(names.get(4));
		
		
	}

}

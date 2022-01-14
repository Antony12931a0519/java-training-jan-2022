package com.advanced_java_examples.friendbook.collection_examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetPredefinedExample {
	
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		names.add("Antony");
		names.add("Sagar");
		names.add("Prashanti");
		names.add("Antony");
		names.add("Sagar");
		names.add("Prashanti");
		
		System.out.println(names);
		for(String name:names)
		{
			System.out.println(name.hashCode());
//			System.out.println(name.eq);
			System.out.println(name);
		}
		names.clear();
		System.out.println(names);
		
		
	}

}

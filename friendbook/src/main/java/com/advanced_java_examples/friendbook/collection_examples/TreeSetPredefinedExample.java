package com.advanced_java_examples.friendbook.collection_examples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPredefinedExample {

	public static void main(String[] args) {

		Set<String> names = new TreeSet<>();
		names.add("Antony");
		names.add("Sagar");
		names.add("Prashanti");

		Set<Long> numbers = new TreeSet<>();
		numbers.add(101l);
		numbers.add(2l);
		numbers.add(1l);
		numbers.add(23l);
		numbers.add(25l);
		numbers.add(0l);
		numbers.add(-1l);

		/*
		 * names.add("Antony"); names.add("Sagar"); names.add("Prashanti");
		 */

		System.out.println(names);
		for (String name : names) {
			System.out.println(name);
		}
		names.clear();
		System.out.println(names);

		System.out.println(numbers);
		for (Long number : numbers) {
			System.out.println(number);
		}
		numbers.clear();
		System.out.println(numbers);

	}

}

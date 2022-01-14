package com.advanced_java_examples.friendbook.collection_examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPredefinedExample {

	public static void main(String[] args) {
		
		Map<Integer,Map> map = new HashMap<>();

		Map<Integer, String> countries = new HashMap<Integer, String>();
		countries.put(1, "India");
		countries.put(2, "USA");

		Map<Integer, Set<String>> states = new HashMap<Integer, Set<String>>();
		Set<String> stateNamesInIndia = new HashSet<>();
		stateNamesInIndia.add("Andhra");
		stateNamesInIndia.add("Telangana");
		stateNamesInIndia.add("Orissa");
		stateNamesInIndia.add("Gujarath");
		stateNamesInIndia.add("East Godvari");

		Set<String> stateNamesInUSA = new HashSet<>();
		stateNamesInUSA.add("Illinos");
		stateNamesInUSA.add("Texas");
		stateNamesInUSA.add("Ohio");
		stateNamesInUSA.add("Neywork");

		states.put(1, stateNamesInIndia);
		states.put(2, stateNamesInUSA);
		
		map.put(1, countries);
		map.put(2, states);
		
		for (Map.Entry<Integer, Map> entry : map.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" and the values are :"+entry.getValue());
		}

	}

}

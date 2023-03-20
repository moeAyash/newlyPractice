package com.java.List;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Ali");
		map.put(4, "Aman");
		map.put(8, "Amir");
		
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
		
		System.out.println(map.size());
		
		if(map.containsKey(8)) {
			System.out.println("map has a given key");
			
		}
		else {System.out.println("map hasnt a given key");}

	}

}

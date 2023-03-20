package com.java.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String , List<String>> map = new HashMap<String,List<String>>();
		
		List<String> valsetone = new ArrayList<String>();
		valsetone.add("Apple");
		valsetone.add("Orange");
		
		List<String> valsettwo = new ArrayList<String>();
		valsettwo.add("Cat");
		valsettwo.add("Dog");
		
		List<String> valsetthree = new ArrayList<String>();
		valsetthree.add("Car");
		valsetthree.add("Bike");
		
		map.put("A", valsetone);
		map.put("B", valsettwo);
		map.put("C", valsetthree);
		
		System.out.println(map);
		
		
		for(Map.Entry<String, List<String>> entry: map.entrySet()) {
			
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println(key+" "+value);
		}

	}

}

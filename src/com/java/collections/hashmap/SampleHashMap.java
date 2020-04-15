package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		print(hm);
		hm.put("Mohammed", 10);
		hm.put("Shaik", 20);
		hm.put("Sibgathulla", 30);
		
		print(hm);
		
		if(hm.containsKey("Mohammed")) {
			Integer a = hm.get("Mohammed");
			System.out.println("The value of key Mohammed is"+a);
		}
		
		
	}
	
	public static void print(Map<String, Integer> map) {
		if(map.isEmpty()) 
			System.out.println("Map is emplty");
		else
			System.out.println("Map is"+map);
	}
}

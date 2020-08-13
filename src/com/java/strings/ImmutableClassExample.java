package com.java.strings;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClassExample {
	private final int id;
	private final String name;
	private final HashMap<String, String> testMap;
	
	
	/**
	 * Constructor performing Deep Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
//	public ImmutableClassExample(int i, String n, HashMap<String, String> hm) {
//		this.id = i;
//		this.name = n;
//		HashMap<String, String> tempMap = new HashMap<>();
//		String key;
//		Iterator<String> it = hm.keySet().iterator();
//		while(it.hasNext()) {
//			key = it.next();
//			tempMap.put(key, hm.get(key));
//		}
//		this.testMap = tempMap;
//	}
	
	/**
	 * Constructor performing Shallow Copy
	 * @param i
	 * @param n
	 * @param hm
	 */
	
	public ImmutableClassExample(int i, String n, HashMap<String,String> hm){
		System.out.println("Performing Shallow Copy for Object initialization");
		this.id=i;
		this.name=n;
		this.testMap=hm;
	}

	
	/**
	 * To test the consequences of Shallow Copy and how to avoid it with Deep Copy for creating immutable classes
	 * @param args
	 */
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	/**
	 * Accessor function for mutable objects
	 */
	public HashMap<String, String> getTestMap() {
		return testMap;
		//return (HashMap<String, String>) testMap.clone();
	}
	
	public static void main(String ar[]) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("1", "First");
		hm.put("2", "Second");
		
		String s = "Original";
		int i = 10;
		
		ImmutableClassExample im = new ImmutableClassExample(i, s, hm);
		
		//Lets see whether its copy by field or reference
		System.out.println(s==im.getName());
		System.out.println(hm==im.getTestMap());
		
		//print the im values
		System.out.println("Id = "+im.getId());
		System.out.println("Name = "+im.getName());
		System.out.println("HashMap = "+im.getTestMap());
						
		//change the local variable values
		i=20;
		s="modified";
		hm.put("3", "Third");
		
		//print the im values after local varaible change
		System.out.println("\nAfter Local Variable Change \n");
		System.out.println("Id = "+im.getId());
		System.out.println("Name = "+im.getName());
		System.out.println("HashMap = "+im.getTestMap());
		
		HashMap<String, String> hmTest = im.getTestMap();
		hmTest.put("4", "Fourth");
		
		System.out.println("Im testMap after changing variable from accessor methods:"+im.getTestMap());
		
		
		
				
	}

	
}

package com.java.collections.hashmap;

import java.util.HashMap;

public class CustomHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Key("Mohammed"), 80);
		hm.put(new Key("Mohammed"), 201);
		hm.put(new Key("Sibgathulla"), 30);
		
        System.out.println("Value for key Mohammed: " + hm.get(new Key("Mohammed"))); 
        System.out.println("Value for key shaik: " + hm.get(new Key("Shaik"))); 
	}
 
}

class Key {
	String key;
 
	
	Key(String key) {
		this.key = key;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		 int hash = (int)key.charAt(0); 
	        System.out.println("hashCode for key: "
	                           + key + " = " + hash); 
	        return hash; 
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return key.equals(((Key)obj).key); 
	}
}

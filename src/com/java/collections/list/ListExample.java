package com.java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<String> vowels = new ArrayList<>();
		//Add example
		vowels.add("a");
		vowels.add("i");
		
		//Let's insert 'e' between 'a' and 'i'
		vowels.add(1, "e");
		System.out.println(vowels);
		
		List<String> list = new ArrayList<String>();
		list.add("o");
		list.add("u");
		
		//appending list elements to vowels
		vowels.addAll(list);
		System.out.println(vowels);
		
		//clear example to empty the list
		list.clear();
		
		//size example
		System.out.println("letters list size = "+vowels.size());
		
		//set example
		vowels.set(2, "e");
		System.out.println(vowels);
		
		//sublist example
		vowels.clear();
		vowels.add("e"); 
		vowels.add("e");
		vowels.add("i"); 
		vowels.add("o");
		
		list = vowels.subList(0, 2);
		System.out.println("vowels = "+vowels+", list="+list);
		vowels.set(0, "a");
		System.out.println("vowels = "+vowels+", list="+list);
		list.add("u");
		System.out.println("vowels = "+vowels+", list="+list);
		
				
		
		
	}
}

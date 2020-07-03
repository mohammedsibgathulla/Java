package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> vowels = new ArrayList<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		//Convert list to array
		String[] strArray = new String[vowels.size()];
		strArray = vowels.toArray(strArray);
		System.out.println(Arrays.toString(strArray));
	}
}

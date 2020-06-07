package com.java.enums;
// Java program to demonstrate working of values(), 
// ordinal() and valueOf() 
enum Colour 
{ 
	RED, GREEN, BLUE; 
} 

public class EnumMethods 
{ 
	public static void main(String[] args) 
	{ 
		// Calling values() 
		Colour arr[] = Colour.values(); 

		// enum with loop 
		for (Colour col : arr) 
		{ 
			// Calling ordinal() to find index 
			// of color. 
			System.out.println(col + " at index "
							+ col.ordinal()); 
		} 

		// Using valueOf(). Returns an object of 
		// Color with given constant. 
		// Uncommenting second line causes exception 
		// IllegalArgumentException 
		System.out.println(Colour.valueOf("RED")); 
		// System.out.println(Color.valueOf("WHITE")); 
	} 
} 

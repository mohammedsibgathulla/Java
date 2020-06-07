package com.java.enums;
// A simple enum example where enum is declared 
// outside any class (Note enum keyword instead of 
// class keyword) 
//Enum declaration can be done outside a Class or inside a Class but not inside a Method. 
enum Color 
{ 
	RED, GREEN, BLUE; 
} 

public class EnumOutsideClass 
{ 
	// Driver method 
	public static void main(String[] args) 
	{ 
		Color c1 = Color.RED; 
		System.out.println(c1); 
	} 
}

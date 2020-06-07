package com.java.enums;
// enum declaration inside a class. 
//Enum declaration can be done outside a Class or inside a Class but not inside a Method. 
public class EnumInsideClass 
{ 
	enum Color 
	{ 
		RED, GREEN, BLUE; 
	} 

	// Driver method 
	public static void main(String[] args) 
	{ 
		Color c1 = Color.RED; 
		System.out.println(c1); 
	} 
}

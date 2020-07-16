package com.java.algorithms.recursion;

public class StringReverse {
	String reverse = "";
	public String reverse(String str) {
		if(str == null || str.length() <= 1)
			return str;
		else
		{
			reverse += str.charAt(str.length()-1)		
					+reverse(str.substring(0, str.length()-1));
			return reverse;
		}
			
	}
	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		System.out.println("Result: "+stringReverse.reverse("Aistle"));
	}
}

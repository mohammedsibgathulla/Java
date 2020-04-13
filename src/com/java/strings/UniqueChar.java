package com.java.strings;

import java.util.HashSet;
//Program to Determine if String has all Unique Characters
public class UniqueChar {
	public static void main(String[] args) {
		 boolean result=false;
	        String inputstring="live present moment";
	        System.out.println(inputstring);
	        HashSet < Character> uniquecharset= new HashSet();
	        for(int i=0;i < inputstring.length();i++)
	        {
	            result=uniquecharset.add(inputstring.charAt(i));
	            if (result == false)
	            break;
	        }
	    System.out.println(result); }
	
}

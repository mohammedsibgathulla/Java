package com.java.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
	public static void stringReverseUsingCharArray(String s) {
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
	}
	public static void stringReverseUsingStringBuilder(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb = sb.reverse();
		for(int i=0; i<sb.length(); i++) {
			System.out.println(sb.charAt(i));
		}
	}
	public static void main(String[] args) {
		String input = "";
		System.out.println("Enter the input string");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			//stringReverseUsingCharArray(input);
			stringReverseUsingStringBuilder(input);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

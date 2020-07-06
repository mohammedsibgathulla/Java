package com.java.exceptions;
import java.io.*; 
/*
 * Checked Exceptions are the exceptions that are checked at compile time. If some code within a method 
	throws a checked exception, then the method must either handle the exception or it must specify 
	the exception using throws keyword.
 */

class CheckedExceptions { 
	public static void main(String[] args) throws IOException { 
		FileReader file = new FileReader("C:\\test\\a.txt"); 
		BufferedReader fileInput = new BufferedReader(file); 
		
		// Print first 3 lines of file "C:\test\a.txt" 
		for (int counter = 0; counter < 3; counter++) 
			System.out.println(fileInput.readLine()); 
		
		fileInput.close(); 
	} 
} 

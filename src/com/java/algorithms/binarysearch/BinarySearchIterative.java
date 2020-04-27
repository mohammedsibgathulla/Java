package com.java.algorithms.binarysearch;

public class BinarySearchIterative { 
	public static int binarySearchIterative(int a[], int key) {
		int l=0, h=a.length-1; 
		while(l<=h) {
			int mid = (l+h)/2; 
			if(a[mid] == key) 
				return mid;
			if(key < a[mid]) 
				h=mid-1;
			else 
				l=mid+1;					
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[] = new int[]{2, 3, 5, 7, 10, 11, 12, 14, 20, 30, 32, 34, 38, 40, 45};
	
		for(int i=0;i<=a.length-1;i++) {
			int result = binarySearchIterative(a, a[i]);	
			if(result >= 0)
				System.out.println("Key found at "+ result);
			else 
				System.out.println("Key not found");
		}
		
		int result = binarySearchIterative(a, 50);	
		if(result >= 0)
			System.out.println("Key found at "+ result);
		else 
			System.out.println("Key not found");
		

	}
}

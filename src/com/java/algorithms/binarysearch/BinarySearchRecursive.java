package com.java.algorithms.binarysearch;

public class BinarySearchRecursive {
	public static int binarySearchRecursive(int l, int h, int key, int a[]) {
		if (l == h) {
			if (key == a[l])
				return l;
			else
				return -1;
		} else {
			int mid = (l + h) / 2;
			
			if (key == a[mid])
				return mid;
			
			if (key > a[mid])
				return binarySearchRecursive(mid + 1, h, key, a);
		
			return binarySearchRecursive(l, mid-1, key, a);
		}
	}
	public static void main(String[] args) {
		int a[] = new int[]{2, 3, 5, 7, 10, 11, 12, 14, 20, 30, 32, 34, 38, 40, 45};
		int l=0, h=a.length-1; 
		
		for(int i=0;i<=a.length-1;i++) {
			int result = binarySearchRecursive(l, h, a[i], a);	
			if(result >= 0)
				System.out.println("Key found at "+ result);
			else 
				System.out.println("Key not found");
		}
		
		int result = binarySearchRecursive(l, h, 50, a);	
		if(result >= 0)
			System.out.println("Key found at "+ result);
		else 
			System.out.println("Key not found");
		

	}

}

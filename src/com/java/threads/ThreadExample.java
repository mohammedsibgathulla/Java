package com.java.threads;

public class ThreadExample extends Thread{
	public void run() {
		System.out.println("Run method executed by child Thread"); 
	}
	
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start();
		System.out.println("Main method executed by main thread"); 
	}
}

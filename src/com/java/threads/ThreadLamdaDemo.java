package com.java.threads;

public class ThreadLamdaDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running from thread");			}
		});
		t.start();
		
		Thread t1 = new Thread(() -> System.out.println("Running thread using lamda expression"));
		t1.start();
		
		System.out.println("Running from main thread");
	}
}

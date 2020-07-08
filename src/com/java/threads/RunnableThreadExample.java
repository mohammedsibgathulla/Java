package com.java.threads;

class Geeks {
	public void m1() {
		System.out.println("Hello Visitors");
	}
}

public class RunnableThreadExample extends Geeks implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run method executed by child Thread");
	}

	public static void main(String[] args) {
		RunnableThreadExample t = new RunnableThreadExample();
		t.m1();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main method executed by main thread");
	}

}

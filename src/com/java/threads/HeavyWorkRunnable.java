package com.java.threads;

public class HeavyWorkRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
			Thread.sleep(1000);
			//Get database connection, delete unused data from DB
            doDBProcessing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
	}

	private void doDBProcessing() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}
//	public static void main(String[] args) {
//		HeavyWorkRunnable heavyWorkRunnable = new HeavyWorkRunnable();
//		Thread t = new Thread(heavyWorkRunnable);
//		t.start();
//	}

}

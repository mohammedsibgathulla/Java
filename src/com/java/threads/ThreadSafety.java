package com.java.threads;
/*
 *  Different ways through which we can make our program thread safe: 
 *  Synchronization is the easiest and most widely used tool for thread safety in java.
    Use of Atomic Wrapper classes from java.util.concurrent.atomic package. For example AtomicInteger
    Use of locks from java.util.concurrent.locks package.
    Using thread safe collection classes.
    Using volatile keyword with variables to make every thread read the data from memory, not read from thread cache.
 */
public class ThreadSafety {
	public static void main(String[] args) throws InterruptedException {
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count="+pt.getCount());
	}
}

class ProcessingThread implements Runnable {
	private  int count;
	@Override
    public void run() {
        for(int i=1; i < 5; i++){
            processSomething(i);
        	count++;
        }
    }
	public int getCount() {
		return count;
	}
	private void processSomething(int i) {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

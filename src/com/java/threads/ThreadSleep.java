package com.java.threads;

/*
 *  It always pause the current thread execution.
    The actual time thread sleeps before waking up and start execution depends on system timers and schedulers. For a quiet system, the actual time for sleep is near to the specified sleep time but for a busy system it will be little bit more.
    Thread sleep doesn’t lose any monitors or locks current thread has acquired.
    Any other thread can interrupt the current thread in sleep, in that case InterruptedException is thrown.
    
    Thread.sleep() interacts with the thread scheduler to put the current thread in wait state for 
    specified period of time. Once the wait time is over, thread state is changed to runnable state 
    and wait for the CPU for further execution. So the actual time that current thread sleep depends on 
    the thread scheduler that is part of operating system.
    
 */
public class ThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		System.out.println("Sleep time in ms="+(System.currentTimeMillis()-start));
	}

}

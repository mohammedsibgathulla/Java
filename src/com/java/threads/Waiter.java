package com.java.threads;

public class Waiter implements Runnable{
	private Message message;
	public Waiter(Message message) {
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		synchronized (message) {
			System.out.println(name+" Waiting to get notified at time: "+System.currentTimeMillis());
			try {
				message.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
	            //process the message now
	         System.out.println(name+" processed: "+message.getMsg());
		}
	}
}

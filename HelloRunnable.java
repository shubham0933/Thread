package com.thread;

public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+": Created From Runnable Interface");
	}

	
}

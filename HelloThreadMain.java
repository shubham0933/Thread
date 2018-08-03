package com.thread;

public class HelloThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		(new Thread(new HelloRunnable())).start();
		
		(new HelloThreadClass()).start();
		
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+": Created From Non-Lambda Expression");
			}
		};
		
		Runnable r2=()->System.out.println(Thread.currentThread().getName()+": Created From Lambda Expression");
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
		
	}

}

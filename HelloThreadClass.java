package com.thread;

public class HelloThreadClass extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+": Created From Thread Class");
	}
}

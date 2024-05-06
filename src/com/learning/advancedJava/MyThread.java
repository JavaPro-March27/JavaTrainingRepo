package com.learning.advancedJava;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		    System.out.println("This is my Thread");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println(t1.isAlive());
		
		Thread.sleep(3000);
		System.out.println(" this is a process");
		
		
		t1.stop();
		System.out.println(t1.isAlive());
	}

}

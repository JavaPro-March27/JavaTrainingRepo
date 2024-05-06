package com.learning.advancedJava;

import java.util.Iterator;

public class SynchronizationExample {
	private static int count = 0;

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(()->{
			for(int i=0; i<500; i++) {
				increase();
			}
		});
		
		
		Thread t2 = new Thread(()->{
			for(int i=0; i<500; i++) {
				increase();
			}
		});
		
		t1.start();
		t2.start();

	}

	public static void increase() {
		count++;
		
		System.out.println("count "+count+ "    " + Thread.currentThread().toString());
	}
}

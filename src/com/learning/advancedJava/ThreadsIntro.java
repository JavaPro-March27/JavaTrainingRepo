package com.learning.advancedJava;

public class ThreadsIntro {

	public static void main(String[] args) {

		
		// Threads 
//		-> spatate execution flow that divide the stack allowing for concurrent processing in a
//		  java application.
//		-> this allow faster processing in cases where the processes need not hapen linearly.
//		 -> generally order of multiple threads is not possible.
		
		
		
//		Threads life cycle states =>
//		New :  This the state of a new thread object that has not started executing yet.
//		Runnable : (running) the thread has started.
//		Blocked : A thread is waiting on a synchronized resource being used by another thread.
//		Waiting : A thread is paused for an unspecified amount of time.
//		Timed_waiting : The thread is paused for an specified amount of time.
//		Terminated: the thread execution has finished.

		
		
//		Thread Methods :
//		.run() =>  the run method is the actual processes that will be run by the thread. 
//		.start() => actually tells the JVM to create a exeution flow in the stack and then runs the run method in that flow.
//		.join() => puts a thread into wating for another thread to complete, when this mearges threads
//		.isAlive() => gives the state of the thread
//		Thread.currentThread() => gives the thread methods is currently veing run by.
//		Thread.sleep(ms) => thread is waiting for an specified amount of time.	

		
//		 Creating a Threads -> there are two ways 
//		 1. Extending the Thread class and overriding the run() method can create a Thread object.
//		 2. Implementing the Runnable interface will also allow you to create a Thread.
//		    => single abstract method => run()
		
		
//	 	 Synchronized -> java provides the "Synchronized". This keyword can be applied to classes, methods , code blocks etc. 
//		 it means that only one thread can access the Synchronized item at a time.
		
		
//		Problems 
		
//		Deadlock:   Two (or more) threads are trying to access the same synchronized objects but
//		            none can get all the object that they need to proceed. This can be resolved usually by
//		            setting thread priorities or logic for threads releasing resources after a specific time.
//		Livelock:   Very similar to deadlock but the threads are releasing resources but they end
//		            up immediately recapturing the resources and so they still never progress.
//		Starvation: This is a less extreme form of deadlock where one thread is holding on to
//		            resources for significantly longer than necessary causing another/other thread(s) to
//		            have to wait to proceed.
		

	}

}

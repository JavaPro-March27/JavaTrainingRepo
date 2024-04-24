package com.learning.day9;

public class ExceptionsIntro {

	public static void main(String[] args) {
		
		// Exception : Abnomal termination of program.
		
		
		
		
//		Types of Exceptions: 2 types 
		
		
//		1. Checked Exception
//		              -> checked At Compile time, Extends the "Exception" class 
//		              -> methods that might throw a checked exception must declare it in their "throws" clause
//		              -> handle it using try/catch block.
//		2. Unchekced Exception
//		              -> not checked at compile time, Extends the "RuntimeException" class
//		              -> methods that might throw a unchecked exception no need to declare it in their "throws" clause
//		              -> caught explicitly.
		
		
		
//	Exception Handling : In order to stop the abnormal termination of progream, we use Exception Handling.
//		                try / catch and finally. 
		
		
//		 Exception Hierarchy
//		 Throwable -> main class 
//		 -> Exception -> subclass 
//		    RuntimeException -> subclass
//		    IOException
//		    SQLException
//		    ClassNotFoundException
//		    ArrayIndexOutOfBoundException
//		    StringIndexOutOfBoundException
		
	
//		 Errors
//		 OutOfMemoryError
//		 StackOverFlowError
//		 VirtualMachineError
		
		
		int a =100; 
		int b=20;
		
		
//		div(a,b);
		
		try {
			div(a,b);
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			
			System.out.println(e);
		}finally {
		  System.out.println(" This will work no matter");	
		}
		
		System.out.println("this is End code.");
		
//		try {
//			method1();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		
		ATM atm = new ATM();
		
		try {
			atm.withdraw(50);
		} catch (MinBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}
	
	
	public static void div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Please dont use b=0"); 
		}
		
		
		System.out.println(a/b);
	}
	
	
	public static void method1() throws InterruptedException {
		Thread.sleep(3000);
		
		System.out.println("This is Method 1");
	}

}

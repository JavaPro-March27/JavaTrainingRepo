package com.learning.day6and8;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		ArrayList<Person> persons =  new ArrayList<Person>();
		// Scanner class is used to get user input.
//		   its imported from java.util
		
		
//		  1. Scanner Object -> System.in 
//		  2. nextLine(); next(); -> String type
//		  3. nextBoolean();
//		  4. nextInt();
//		  .........->
		
		
//		
//		Scanner sc1 = new Scanner(System.in);
//		
////		System.out.println("Enter your name : ");
////		String name = sc1.nextLine();
//		
//		Student student1 = new Student();
//		
//		System.out.println("Enter your id : ");
//		
//		int sId = sc1.nextInt();
//		student1.setId(sId);
//
//		sc1.nextLine();
//		System.out.println("Enter your name : ");
//		
//		String sName = sc1.nextLine();
//		student1.setName(sName);
//		System.out.println("Enter your gpa : ");
//		
//		double sGpa = sc1.nextDouble();
//		sc1.nextLine();
//		student1.setGpa(sGpa);
//		System.out.println("Enter your age : ");
//		
//		int sAge = sc1.nextInt();
//		sc1.nextLine();
//		student1.setAge(sAge);
//		
//		System.out.println(student1);
		
// create a person class and create a object by taking a input using scanner	     
//	      -> firstName
//	      -> lastName
//	      -> phonenumber 
//	      -> email
//	      -> dob 12-4-2022
//	      -> age 
//	      -> address 
//		  -> salary
//		  -> hasOwnhouse
		
		
//		sc1.close();
		
		
		
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Welcome to my Company");
		
		System.out.println("a. create person");
		System.out.println("b. exit");
		String option = sc2.nextLine();
		
//		if(option.equalsIgnoreCase("a")) {
//			Person person1 = new Person();
//			System.out.println("Enter your firstName : ");
//			person1.setFirstName(sc2.nextLine());
//			
//			System.out.println("Enter your lastName : ");
//			person1.setLastName(sc2.nextLine());
//			
//			System.out.println("Enter your phonenumber : ");
//			person1.setPhonenumber(sc2.nextInt());
//			sc2.nextLine();
//			
//			System.out.println("Enter your email : ");
//			person1.setEmail(sc2.nextLine());
//			
//			System.out.println("Enter your dob : ");
//			person1.setDob(sc2.nextLine());
//			
//			System.out.println("Enter your age : ");
//			person1.setAge(sc2.nextInt());
//			sc2.nextLine();
//			
//			System.out.println("Enter your address : ");
//			person1.setAddress(sc2.nextLine());
//			
//			System.out.println("Enter your salary : ");
//			person1.setSalary(sc2.nextDouble());
//			sc2.nextLine();
//			
//			System.out.println("Enter your hasOwnhouse : ");
//			person1.setHasOwnhouse(sc2.nextBoolean());
//			sc2.nextLine();
//
//			
//			System.out.println(person1);
//			
//		}else if(option.equalsIgnoreCase("b")) {
//			System.out.println("exited.............");
//		}
		boolean stop = false;
		while(!stop) {
			switch(option) {
			case "a":
				Person person1 = new Person();
				System.out.println("Enter your firstName : ");
				person1.setFirstName(sc2.nextLine());
				
				System.out.println("Enter your lastName : ");
				person1.setLastName(sc2.nextLine());
				
				System.out.println("Enter your phonenumber : ");
				person1.setPhonenumber(sc2.nextInt());
				sc2.nextLine();
				
				System.out.println("Enter your email : ");
				person1.setEmail(sc2.nextLine());
				
				System.out.println("Enter your dob : ");
				person1.setDob(sc2.nextLine());
				
				System.out.println("Enter your age : ");
				person1.setAge(sc2.nextInt());
				sc2.nextLine();
				
				System.out.println("Enter your address : ");
				person1.setAddress(sc2.nextLine());
				
				System.out.println("Enter your salary : ");
				person1.setSalary(sc2.nextDouble());
				sc2.nextLine();
				
				System.out.println("Enter your hasOwnhouse : ");
				person1.setHasOwnhouse(sc2.nextBoolean());
				sc2.nextLine();

				persons.add(person1);
				
				System.out.println("person is added successfully........");
				System.out.println("a. create person");
				System.out.println("b. exit");
				 option = sc2.nextLine();
				break;
			case "b":
				System.out.println("exited.............");
				stop= true;
				break;
			default:
				System.out.println("Invalid Input");
			
			}
		}

		
		sc2.close();
		
		
	}

}

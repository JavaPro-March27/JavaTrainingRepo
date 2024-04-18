package com.learning.day6and8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableVSComparator {

	public static void main(String[] args) {
		
		
//		    comparable                                                    comparator
		
//         comparable is a interface -> java.lang		              comparator is a interface -> java.Util
//		  it is used to compare cuurent object with another           it is used for comparing two objects 
//		  Object
//		  compareTo(Object obj);                                                 compare(Object obj1, Object obj2);
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student(1, "roy", 3.2, 21);
		students.add(s1);

		students.add(new Student(3, "jack", 3.1, 26));
		students.add(new Student(4, "adams", 2.0, 25));
		students.add(new Student(2, "ana", 2.5, 33));
		
		students.add(new Student(5, "kim", 3.8, 36));
		
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		Collections.sort(students);
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------------------------------------------");

		
	    Collections.sort(students, new StudentAgeComparator());
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		 Collections.sort(students, new StudentGPAComparator());
		 
			
			for(Student s: students) {
				System.out.println(s);
			}
			
			
	}

}

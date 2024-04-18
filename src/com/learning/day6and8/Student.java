package com.learning.day6and8;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private double gpa;
	private int age;
	
	
	
	
	
	public Student(int id, String name, double gpa, int age) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Student o) {
		
		return this.id - o.id;
	}
	
	
	

}

package com.learning.day6and8;

public class Person {
	
private String  firstName;
private String   lastName;
private int  phonenumber ;
private String   email;
private String   dob;
private int  age ;
private String  address;
private double salary;
private boolean hasOwnhouse;



public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isHasOwnhouse() {
	return hasOwnhouse;
}
public void setHasOwnhouse(boolean hasOwnhouse) {
	this.hasOwnhouse = hasOwnhouse;
}
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phonenumber=" + phonenumber + ", email="
			+ email + ", dob=" + dob + ", age=" + age + ", address=" + address + ", salary=" + salary + ", hasOwnhouse="
			+ hasOwnhouse + "]";
}




}

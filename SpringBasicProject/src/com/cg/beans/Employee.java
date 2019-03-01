package com.cg.beans;

import java.util.ArrayList;

public class Employee {
private String firstName;
private String lastName;
private int age;
ArrayList<String> skills;
public Employee(String firstName, String lastName, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(String name, int age) {
	firstName= name.substring(0,name.indexOf(" "));
	lastName= name.substring(name.indexOf(" ")+1);
	this.age = age;
}


public ArrayList<String> getSkills() {
	return skills;
}
public void setSkills(ArrayList<String> skills) {
	this.skills = skills;
}
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {

	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", skills=" + skills + "]";
}


}

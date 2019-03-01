package com.cg.beans;

import java.util.ArrayList;

import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean {
private String firstName;
private String lastName;
private int age;
private Department dept;

public Employee(String firstName, String lastName, int age) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	
}


public Employee(Department dept)
{
	this.dept =dept;
}
public Employee() {
	super();
	//dept = new Department(1,"IT";)
	// TODO Auto-generated constructor stub
}


public Employee(String name, int age) {
	firstName= name.substring(0,name.indexOf(" "));
	lastName= name.substring(name.indexOf(" ")+1);
	this.age = age;
}



public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
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

public void m1()
{
	System.out.println("do some initialization work here");
}
public void m2()
{
	System.out.println("clean up of bean ");
}


@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	
}


@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dept=" + dept + "]";
}



}

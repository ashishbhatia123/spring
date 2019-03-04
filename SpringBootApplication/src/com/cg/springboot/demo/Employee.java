package com.cg.springboot.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
@Value("Yogini")
	private String firstName;
@Value("Naik")
	private String lastName;
@Autowired
private Department dept;

	
	public Employee(String firstName, String lastName, Department dept) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dept = dept;
}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	@PostConstruct
	public void init() {
		System.out.println("initialization work");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("clean up work ");
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + "]";
	}
	
	
	
}

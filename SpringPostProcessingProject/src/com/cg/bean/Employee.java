package com.cg.bean;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
	
	private int employeeId;
	private String name;
	private double salary;
	private LocalDate joinDate;
	private ArrayList<String> skills;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public Employee(int employeeId, String name, double salary, LocalDate joinDate, ArrayList<String> skills) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
		this.skills = skills;
	}
	

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", joinDate=" + joinDate + "]";
	}
	
	
	
	

}

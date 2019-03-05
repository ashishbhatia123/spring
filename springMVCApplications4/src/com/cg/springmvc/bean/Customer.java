package com.cg.springmvc.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	@NotEmpty(message="first name cannot be blank")
	@Pattern(regexp="[A-Z][a-z]{4,}",message="name should contain only alphabets")
	private String firstName;
	@NotEmpty(message="last name cannot be blank")
	@Pattern(regexp="[A-Z][a-z]{4,}",message="name should contain only alphabets")
	private String lastName;
	@Min(value=20,message="age should be>20")
	@Max(value=50,message="age should be<20")
	private int age;
	@Pattern(regexp="[0-9]{10}", message="mobile no. should be 10 digit long")
	private String mobileNo;
	private String email;
	private String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", email=" + email + "]";
	}
	
	
	
	

}

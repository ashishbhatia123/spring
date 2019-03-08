package com.cg.mpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Customer;
import com.cg.bean.Employee;
import com.cg.springmvc.service.ICustomerService;

@RestController
public class HelloController {
	@Autowired
	ICustomerService serviceObj;

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello()
	{
		return "Hello";
	}
	@RequestMapping(value="/getEmployee",method=RequestMethod.GET,produces="application/json")
	public Employee getEmployeeDetails()
	{
		Employee emp=new Employee();
		emp.setFirstName("yogini");
		emp.setLastName("naik");
		emp.setEmail("yogini@gmail.com");
		emp.setMobileNo("9458207565");
		return emp;
	}
	
	@RequestMapping(value="/addEmployee",method =RequestMethod.POST)
	public Employee addEmployee(
			@RequestParam("fname")String firstname,
			@RequestParam("lname")String Lastname,
			@RequestParam("mobno")String mobileNo,
			@RequestParam("email")String email)
	{
		Employee emp = new Employee();
		emp.setFirstName(firstname);
		emp.setLastName(Lastname);
		emp.setEmail(email);
		emp.setMobileNo(mobileNo);
		return emp;
		
	}
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST,produces="application/json")
	public Customer addCoustomer(
			@RequestParam("fname")String firstname,
			@RequestParam("lname")String Lastname,
			@RequestParam("age")int age,
			@RequestParam("city")String city,
			
			@RequestParam("mobno")String mobileNo,
			@RequestParam("email")String email)
	{
		
		Customer customer = new Customer();
		customer.setFirstName(firstname);
		customer.setLastName(Lastname);
		customer.setAge(age);
		customer.setCity(city);
		customer.setMobileNo(mobileNo);
		customer.setEmail(email);
		
	serviceObj.addCustomer(customer);
		return customer;
	}
	
}

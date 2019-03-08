package com.cg.mpt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	//---addCustomer-----
	@RequestMapping(value="/addCustomer",consumes= "application/json",produces="application/json",method=RequestMethod.POST)
	public Customer addCoustomer(@RequestBody Customer customer)	
	{	
		
	customer=serviceObj.addCustomer(customer);
		return customer;
	}
	
	//----updateCustomer----
	@RequestMapping(value="/updateCustomer",consumes="application/json",produces="application/json",method=RequestMethod.POST)
	public Customer updateCoustomer(@RequestBody Customer customer)	
	{	
		
	customer=serviceObj.updateCustomer(customer);
		return customer;
	}
	//----deleteCustomer ---
	
	@RequestMapping(value="/deleteCustomer{custid}",produces="application/json")
	public Customer deleteCoustomer(@PathVariable int custid)	
	{	
		
	Customer customer= serviceObj.deleteCustomer(custid);
		return customer;
	}
	//----getCustomer-----
	@RequestMapping(value="/getCustomer/{custid}",produces="application/json")
	public Customer findCustomerr(@PathVariable int custid )
	{
		Customer customer = serviceObj.findCustomer(custid);

		return customer;
	}
	@RequestMapping(value="/getCustomerList",produces="application/json")
	public List<Customer> getCustomerrList()
	{
		List<Customer> list = serviceObj.getCustomerList();

		return list;
	}
	
	
	
}

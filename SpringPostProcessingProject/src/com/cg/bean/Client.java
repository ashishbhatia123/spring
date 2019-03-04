package com.cg.bean;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
		Employee emp= context.getBean(Employee.class);
		System.out.println(emp);
		System.out.println("\n");
		ArrayList<String> list =emp.getSkills();
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
		/*DBConfig config = context.getBean(DBConfig.class);
		
		System.out.println(config.getDriverName());
		System.out.println(config.getUrl());
		System.out.println(config.getUserName());
		System.out.println(config.getPassword());*/
	}

}
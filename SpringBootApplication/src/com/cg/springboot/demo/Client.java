package com.cg.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.cg")
public class Client {
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Client.class,args);
		// spring 
		
		//Spring boot statement is different
		
		Employee ep = (Employee) context.getBean("emp");
		System.out.println(ep);
	}

}

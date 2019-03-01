package com.cg.beans;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	

	
	public static void main(String[] args) {
	
		
		Resource res = new ClassPathResource("beans.xml");
		XmlBeanFactory factory =new XmlBeanFactory(res);	
		Employee employee1= (Employee) factory.getBean("emp1");
		Employee employee2= (Employee) factory.getBean("emp2");
		System.out.println(employee1);
		System.out.println(employee2);
	
		System.out.println("back to main");
		
		
	}
}

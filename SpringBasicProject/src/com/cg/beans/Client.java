package com.cg.beans;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		/*Employee emp = new Employee();
		emp.setFirstName("yogini");
		emp.setLastName("Naik");
		emp.setAge(33);
		System.out.println(emp);*/
		
		Resource res = new ClassPathResource("beans.xml");
		XmlBeanFactory factory =new XmlBeanFactory(res);
		
		Employee employee =(Employee) factory.getBean("emp");
		/*employee.setFirstName("A");
		employee.setLastName("B");
		employee.setAge(20);*/
		
		System.out.println(employee);
		
		
		
		
		UserCredentials users=  factory.getBean(UserCredentials.class); // or(UserCredentials) factory.getBean("cred"); 
		System.out.println(users);
	}

}

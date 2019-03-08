package com.cg.mpt.springBootJPAIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
public class SpringBootJpaIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaIntegrationApplication.class, args);
	}

}

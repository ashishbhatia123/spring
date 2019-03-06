package com.cg.springmvc.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvc.bean.Customer;

@Repository("repo")
public class CustomerRepositoryImpl  implements ICustomerRepository{

	@PersistenceContext
	EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.persist(customer);
		entityManager.flush(); // same as commit
		return customer;
	}
	
	

	
}

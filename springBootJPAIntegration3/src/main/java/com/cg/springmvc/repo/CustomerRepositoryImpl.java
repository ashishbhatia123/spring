package com.cg.springmvc.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.bean.Customer;


@Repository("repo")
public class CustomerRepositoryImpl implements ICustomerRepository {

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
		entityManager.flush();
		return customer;
	}
	@Override
	public Customer findCustomer(int customerid) {
		Customer customer= 
				entityManager.find(Customer.class, customerid);
		if(customer==null)
			return null;
			customer.setCustomerId(customerid);
		return customer;
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		Customer c1=entityManager.merge(customer);
		entityManager.flush();
		return c1;
	}
	@Override
	public List<Customer> getCustomerList() {
		TypedQuery<Customer> query=
	entityManager.createQuery
	("select customer from Customer customer ", Customer.class);
			
		List<Customer> list= query.getResultList();
	return list;
	}
	@Override
	public Customer deleteCustomer(int custid) {
		Customer customer= entityManager.find(Customer.class, custid);
		entityManager.remove(customer);
		entityManager.flush();
		return customer;
	}

}

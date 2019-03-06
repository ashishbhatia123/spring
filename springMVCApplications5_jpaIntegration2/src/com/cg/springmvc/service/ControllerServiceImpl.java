package com.cg.springmvc.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvc.bean.Customer;
import com.cg.springmvc.repo.ICustomerRepository;

@Transactional
@Service("service")
public class ControllerServiceImpl implements ICustomerService {
@Autowired
	ICustomerRepository repo;
public ICustomerRepository getRepo()
{
	return repo;
}



public void setRepo(ICustomerRepository repo) {
	this.repo = repo;
}



@Override
public Customer addCustomer(Customer customer) {
	
	return repo.addCustomer(customer);
}
	
	
}

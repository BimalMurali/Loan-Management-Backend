package com.loan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.common.Validation;
import com.loan.entity.Customer;
import com.loan.repository.ICustomerRepo;
@Service

public class CustomerServiceImple implements ICustomerService {

	@Autowired
	private ICustomerRepo customerRepo;
	@Autowired
	private Validation validation;
	
//	list
	public List<Customer> getCustomer() {
		return(List<Customer>) customerRepo.findAll();
	}

//	save
	public Customer saveCustomer(Customer customer) {
		if(validation.isNameValid(customer.getCustName())) {
			return customerRepo.save(customer);
			}
			return customer;
	}

//	update
	public Customer updateCustomer(int id) {
		return customerRepo.findById(id)
				.orElseThrow(()-> new
				RuntimeException("Customer not found for id"+id));
	}

//	delete
	public void deleteCustomer(int id) {

	}

}

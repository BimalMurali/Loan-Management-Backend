package com.loan.services;

import java.util.List;

import com.loan.entity.Customer;


public interface ICustomerService {
	
	    //list
		public List<Customer>getCustomer();
		
		//insert
		public Customer saveCustomer(Customer customer);
		
		//update by id
		public Customer updateCustomer(int id);
		
		//delete
		public void deleteCustomer(int id);
	

}

package com.loan.repository;

import org.springframework.data.repository.CrudRepository;

import com.loan.entity.Customer;



public interface ICustomerRepo extends CrudRepository<Customer, Integer>{

}

package com.loan.repository;

import org.springframework.data.repository.CrudRepository;

import com.loan.entity.Admin;


public interface IAdminRepo extends CrudRepository<Admin, Integer>{

}

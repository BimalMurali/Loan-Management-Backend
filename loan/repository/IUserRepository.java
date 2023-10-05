package com.loan.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loan.entity.Users;

@Repository
public interface IUserRepository extends CrudRepository<Users,Integer>{
	
	//custom method
	@Query("from User WHERE userName=?1 AND password=?2")
	public Users findUserByNameAndPassword(String userName,String password);

}

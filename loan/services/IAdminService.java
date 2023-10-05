package com.loan.services;

import java.util.List;

import com.loan.entity.Admin;


public interface IAdminService {
	
	//list
		public List<Admin>getAdminDetails();
		
		//insert
		public Admin saveAdmin(Admin admin);
		
//		delete by id
		public void deleteAdmin(int id);
		
		//update by id
		public Admin updateAdmin(int id);
	

}

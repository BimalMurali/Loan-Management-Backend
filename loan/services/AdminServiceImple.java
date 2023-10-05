package com.loan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.entity.Admin;
import com.loan.repository.IAdminRepo;
@Service

public class AdminServiceImple implements IAdminService {

	@Autowired
	private IAdminRepo adminRepo;
	
	public List<Admin> getAdminDetails() {
		// TODO Auto-generated method stub
		return (List<Admin>) adminRepo.findAll();
	}

	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admin updateAdmin(int id) {
		return adminRepo.findById(id)
				.orElseThrow(()-> new
				RuntimeException("Admin not found for id"+id));
	}

}

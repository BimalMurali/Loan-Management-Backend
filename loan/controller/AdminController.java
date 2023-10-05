package com.loan.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loan.common.APIResponse;
import com.loan.entity.Admin;
import com.loan.services.IAdminService;

@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private IAdminService adminService;
	@Autowired
	private APIResponse apiResponse;

	//list
			@GetMapping("/admin")
			public List<Admin> getAdminDetails(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
				return adminService.getAdminDetails();
			}
			
			//add
			@PostMapping("/admin")
			public ResponseEntity<APIResponse> addAssetCreation(@RequestBody Admin admin){
				if(adminService.saveAdmin(admin)==null) {
					apiResponse.setData(("Name can have only alphabets"));
					apiResponse.setStatus(500);
					apiResponse.setError("Invalid name");
					return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				}
				apiResponse.setData("Admin added sucessfully");
				apiResponse.setStatus(200);
				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
					
			}
			
			
			//update 
			@PutMapping("/admin")
			public ResponseEntity<APIResponse> updateAdmin(@RequestBody Admin admin){
				if(adminService.saveAdmin(admin)==null) {
					apiResponse.setData(("Name can have only alphabets"));
					apiResponse.setStatus(500);
					apiResponse.setError("Invalid name");
					return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				}
				apiResponse.setData("Admin updated sucessfully");
				apiResponse.setStatus(200);
				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				
			}

}

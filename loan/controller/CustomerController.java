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
import com.loan.entity.Customer;
import com.loan.services.ICustomerService;



@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	@Autowired
	private APIResponse apiResponse;
	

    //list
	@GetMapping("/customers")
	public List<Customer> getCustomer(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
		return customerService.getCustomer();
	}
	
	
	//add
	@PostMapping("/customers")
	public ResponseEntity<APIResponse> addAssetCreation(@RequestBody Customer customer){
		if(customerService.saveCustomer(customer)==null) {
			apiResponse.setData(("Name can have only alphabets"));
			apiResponse.setStatus(500);
			apiResponse.setError("Invalid name");
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
		}
		apiResponse.setData("Asset added sucessfully");
		apiResponse.setStatus(200);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
			
	}
	
	
	//update 
			@PutMapping("/customers")
			public ResponseEntity<APIResponse> updateCustomer(@RequestBody Customer customer){
				if(customerService.saveCustomer(customer)==null) {
					apiResponse.setData(("Name can have only alphabets"));
					apiResponse.setStatus(500);
					apiResponse.setError("Invalid name");
					return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				}
				apiResponse.setData("Customer Data updated sucessfully");
				apiResponse.setStatus(200);
				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				
			}
	

}

package com.crud.restservice.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.restservice.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) 
	{
		return cloudVendor;
	}
	
	@PostMapping
	public String createCloudVendor(@RequestBody CloudVendor cloudVendor) 
	{
		this.cloudVendor = cloudVendor;
		return "Cloud vendor created successfully!";
	}
	
	@PutMapping
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) 
	{
		this.cloudVendor = cloudVendor;
		return "Cloud vendor updated successfully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) 
	{
		this.cloudVendor = null;
		return "Cloud vendor deleted successfully!";
				//new CloudVendor("C1", "Vandoer 1", "Address 1", "xxxxxx");
	}
}

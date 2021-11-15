package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.VehicleRentCustomerLink;
import com.github.service.VehicleRentCustomerLinkService;

@Controller
public class VehicleRentCustomerLinkController {
	@Autowired
	VehicleRentCustomerLinkService vehicleRentCustomerLinkService;
	
	@GetMapping( "/FetchVehicleRentCustomer")
	@ResponseBody
	public List< VehicleRentCustomerLink> getalldetails() {
		return vehicleRentCustomerLinkService.getalldetails();
	}

	
}

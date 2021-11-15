package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.Customer;
import com.github.model.VehicleRent;
import com.github.model.VehicleType;
import com.github.service.CustomerService;

@Controller
public class CustomerController {
@Autowired
CustomerService customerService;
@GetMapping( "/FetchCustomerList")
@ResponseBody
public List<Customer> getallCustomers() {
	return customerService.getallCustomers();
}


@PostMapping("/SaveCustomer")
@ResponseBody
public Customer saveCustomer( @RequestBody Customer customer) {
	return customerService.saveCustomer(customer);
}


@PutMapping("/UpdateCustomerList")
@ResponseBody
public Customer updateCustomer(@RequestBody Customer customerDetails) {
	customerService.updateCustomer( customerDetails);
	 return customerDetails;
}


@DeleteMapping("/DeleteCustomer/{custid}")
@ResponseBody
public void  deleteCustomer(@PathVariable("custid") long custid) {
	customerService.deleteCustomer(custid);
}
}

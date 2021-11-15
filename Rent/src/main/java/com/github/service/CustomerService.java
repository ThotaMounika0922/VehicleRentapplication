package com.github.service;

import java.util.List;

import com.github.model.Customer;

public interface CustomerService {

	List<Customer> getallCustomers();

	void deleteCustomer(long custid);

	Customer saveCustomer(Customer customer);

	

	void updateCustomer(Customer customerDetails);

}

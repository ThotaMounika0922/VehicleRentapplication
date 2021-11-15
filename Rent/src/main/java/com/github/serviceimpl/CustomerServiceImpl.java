package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.Customer;
import com.github.model.VehicleType;
import com.github.repository.CustomerRepository;
import com.github.service.CustomerService;
@Service
public class CustomerServiceImpl  implements CustomerService{
	@Autowired
	CustomerRepository customerRepository;
	@Override
	public List<Customer> getallCustomers() {
		return customerRepository.findAll();
	}
	@Override
	public void deleteCustomer(long custid) {

		customerRepository.delete(custid);
	}
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customerDetails) {
		customerRepository.save(customerDetails);
	}
	
	

}

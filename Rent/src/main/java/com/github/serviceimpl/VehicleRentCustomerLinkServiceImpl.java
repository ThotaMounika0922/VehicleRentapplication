package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.VehicleRentCustomerLink;
import com.github.repository.VehicleRentCustomerLinkRepository;
import com.github.service.VehicleRentCustomerLinkService;
@Service
public class VehicleRentCustomerLinkServiceImpl implements VehicleRentCustomerLinkService {
@Autowired
VehicleRentCustomerLinkRepository vehicleRentCustomerLinkRepository;

	@Override
	public List<VehicleRentCustomerLink> getalldetails() {
		return vehicleRentCustomerLinkRepository.findAll();
}

}

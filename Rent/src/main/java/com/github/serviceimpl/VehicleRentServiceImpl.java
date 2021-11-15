package com.github.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.VehicleRent;

import com.github.repository.VehicleRentRepository;
import com.github.service.VehicleRentService;
@Service
public class VehicleRentServiceImpl  implements VehicleRentService{
@Autowired
VehicleRentRepository vehicleRentRepository;
	@Override
	public List<VehicleRent> getallVehicleRents() {
		
		return vehicleRentRepository.findAll();
	}
	@Override
	public void deleteVehicleRent(long vehiclerentalid) {
		vehicleRentRepository.delete(vehiclerentalid);
	}
	@Override
	public VehicleRent saveVehicleRent(VehicleRent vehiclerent) {
		return vehicleRentRepository.save(vehiclerent);
	}
	@Override
	public void updateVehicleRent(VehicleRent vehicleRentDetails) {
		vehicleRentRepository.save(vehicleRentDetails);
	}

}

package com.github.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.model.Vehicle;
import com.github.repository.VehicleRepository;
import com.github.service.VehicleService;




@Service
@Transactional
public class VehicleServiceImpl  implements VehicleService{
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getallVehicles() {
		return vehicleRepository.findAll();
	}

	@Override
	public void deleteVehicle(long vehicleid) {
		vehicleRepository.delete(vehicleid);
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public void updateVehicle(Vehicle vehicleDetails) {
		// TODO Auto-generated method stub
		vehicleRepository.save(vehicleDetails);
		
	}

	
}

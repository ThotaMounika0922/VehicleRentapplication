package com.github.serviceimpl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.model.VehicleType;
import com.github.repository.VehicleTypeRepository;
import com.github.service.VehicleTypeService;
@Service
@Transactional
public class VehicleTypeServiceImpl implements VehicleTypeService {
@Autowired
VehicleTypeRepository vehicleTypeRepository;
	@Override
	public List<VehicleType> getallVehicleType() {
		return  vehicleTypeRepository.findAll();

}
	@Override
	public VehicleType saveVehicleType(VehicleType vehicletype) {
		return vehicleTypeRepository.save(vehicletype);
	}

	
	@Override
	public void updateVehicletype( VehicleType vehicleTypeDetails) {

			 vehicleTypeRepository.save(vehicleTypeDetails);
	}
@Override
public void deleteVehicleType(long vehicletypeid) {
	
	vehicleTypeRepository.delete(vehicletypeid);
		
	}
}


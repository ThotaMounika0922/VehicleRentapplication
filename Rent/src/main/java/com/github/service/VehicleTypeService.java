package com.github.service;

import java.util.List;

import com.github.model.VehicleType;

public interface VehicleTypeService {

	List<VehicleType> getallVehicleType();

	VehicleType saveVehicleType(VehicleType vehicletype);

	void updateVehicletype( VehicleType vehicleTypeDetails);

	void deleteVehicleType(long vehicletypeid);

	

}

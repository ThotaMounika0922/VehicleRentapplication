package com.github.service;

import java.util.List;

import com.github.model.VehicleRent;
import com.github.model.VehicleType;

public interface VehicleRentService {

	List<VehicleRent> getallVehicleRents();

	void deleteVehicleRent(long vehiclerentalid);

	VehicleRent saveVehicleRent(VehicleRent vehiclerent);

	void updateVehicleRent(VehicleRent vehicleRentDetails);

}

package com.github.service;

import java.util.List;

import com.github.model.Vehicle;

public interface VehicleService {

	List<Vehicle> getallVehicles();

	void deleteVehicle(long vehicleid);

	Vehicle saveVehicle(Vehicle vehicle);

	void updateVehicle(Vehicle vehicleDetails);

}

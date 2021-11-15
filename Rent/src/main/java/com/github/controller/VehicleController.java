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

import com.github.model.Vehicle;
import com.github.model.VehicleType;
import com.github.service.VehicleService;

@Controller 
public class VehicleController {
	@Autowired
	VehicleService  vehicleService;
	@GetMapping("/FetchVehicles")
	@ResponseBody
	public List<Vehicle> getallVehicles(){
		return vehicleService.getallVehicles();
	}
	
	@PostMapping("/SaveVehicles")
	@ResponseBody
	public Vehicle saveVehicle( @RequestBody Vehicle vehicle) {
		return vehicleService.saveVehicle(vehicle);
	}
	
	@PutMapping("/UpdateVehicles")
	@ResponseBody
	public Vehicle updateVehicle(@RequestBody Vehicle vehicleDetails) {
		 vehicleService.updateVehicle( vehicleDetails);
		 return vehicleDetails;
	}

	
	@DeleteMapping("/DeleteVehicles/{vehicleid}")
	@ResponseBody
	public void  deleteVehicle(@PathVariable("vehicleid") long vehicleid) {
		vehicleService.deleteVehicle(vehicleid);
	}

}

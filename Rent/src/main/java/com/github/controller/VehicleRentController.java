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
import com.github.model.VehicleRent;
import com.github.model.VehicleType;
import com.github.service.VehicleRentService;
import com.github.service.VehicleTypeService;
@Controller
public class VehicleRentController {
	@Autowired
	VehicleRentService vehicleRentService;
	@GetMapping( "/FetchVehicleRent")
	@ResponseBody
	public List<VehicleRent> getallVehicleRent() {
		return vehicleRentService.getallVehicleRents();
	}
	
	@PostMapping("/SaveVehicleRent")
	@ResponseBody
	public VehicleRent saveVehicleRent( @RequestBody VehicleRent vehiclerent) {
		return vehicleRentService.saveVehicleRent(vehiclerent);
	}
	@PutMapping("/UpdateVehicleRent")
	@ResponseBody
	public VehicleRent updateVehicleRent(@RequestBody VehicleRent vehicleRentDetails) {
		vehicleRentService.updateVehicleRent( vehicleRentDetails);
		 return vehicleRentDetails;
	}

	
	@DeleteMapping("/DeletevehicleRent/{vehiclerentalid}")
	@ResponseBody
	public void  deleteVehicleRent(@PathVariable("vehiclerentalid") long vehiclerentalid) {
		vehicleRentService.deleteVehicleRent(vehiclerentalid);
	}

}

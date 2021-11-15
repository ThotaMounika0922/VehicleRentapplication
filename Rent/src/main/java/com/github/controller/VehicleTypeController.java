package com.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.model.VehicleType;
import com.github.service.VehicleTypeService;


@Controller 
public class VehicleTypeController {
	@Autowired
	VehicleTypeService vehicleTypeService;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "good";
	}
	@GetMapping( "/FetchVehicleTypeList")
	@ResponseBody
	public List<VehicleType> getallVehicleType() {
		return vehicleTypeService.getallVehicleType();
	}
	@PostMapping("/SaveVehicleType")
	@ResponseBody
	public VehicleType saveVehicleType( @RequestBody VehicleType vehicletype) {
		return vehicleTypeService.saveVehicleType(vehicletype);
	}
	@PutMapping("/UpdateVehicleTypeList")
	@ResponseBody
	public VehicleType updateVehicletype(@RequestBody VehicleType vehicleTypeDetails) {
		 vehicleTypeService.updateVehicletype( vehicleTypeDetails);
		 return vehicleTypeDetails;
	}

	@DeleteMapping("/Delete/{vehicletypeid}")
	@ResponseBody
	public void  deleteVehicleType(@PathVariable("vehicletypeid") long vehicletypeid) {
		vehicleTypeService.deleteVehicleType(vehicletypeid);
	}
}
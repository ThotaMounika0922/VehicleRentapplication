package com.github.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "vehicleid")
	private long vehicleid;
	private long vehicletypeid;
	public long getVehicletypeid() {
		return vehicletypeid;
	}


	public void setVehicletypeid(long vehicletypeid) {
		this.vehicletypeid = vehicletypeid;
	}


	private String vehicleregistration;
	private String vehicledescription;
	private int rentalrate;



	public long getVehicleid() {
		return vehicleid;
	}


	public void setVehicleid(long vehicleid) {
		this.vehicleid = vehicleid;
	}


	public String getVehicleregistration() {
		return vehicleregistration;
	}


	public void setVehicleregistration(String vehicleregistration) {
		this.vehicleregistration = vehicleregistration;
	}


	public String getVehicledescription() {
		return vehicledescription;
	}


	public void setVehicledescription(String vehicledescription) {
		this.vehicledescription = vehicledescription;
	}


	public int getRentalrate() {
		return rentalrate;
	}


	public void setRentalrate(int rentalrate) {
		this.rentalrate = rentalrate;
	}


	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}


//	public Vehicle(long vehicleid, String vehicleregistration, String vehicledescription, int rentalrate) {
//		super();
//		this.vehicleid = vehicleid;
//		this.vehicleregistration = vehicleregistration;
//		this.vehicledescription = vehicledescription;
//		this.rentalrate = rentalrate;
//	}
//	
//
////
//	@Override
//	public String toString() {
//		return "Vehicle [vehicleid=" + vehicleid + ", vehicleregistration=" + vehicleregistration
//				+ ", vehicledescription=" + vehicledescription + ", rentalrate=" + rentalrate + "]";
//	}
//

public Vehicle(long vehicleid, long vehicletypeid, String vehicleregistration, String vehicledescription,
		int rentalrate) {
	super();
	this.vehicleid = vehicleid;
	this.vehicletypeid = vehicletypeid;
	this.vehicleregistration = vehicleregistration;
	this.vehicledescription = vehicledescription;
	this.rentalrate = rentalrate;
}


@Override
public String toString() {
	return "Vehicle [vehicleid=" + vehicleid + ", vehicletypeid=" + vehicletypeid + ", vehicleregistration="
			+ vehicleregistration + ", vehicledescription=" + vehicledescription + ", rentalrate=" + rentalrate + "]";
}

}
	

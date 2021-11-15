package com.github.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicleRentCustomerLink")
public class VehicleRentCustomerLink{ 
@Id
	@Column(name = "Custid")
	private long custid;
	@Column(name = "vehiclerentalid")
	private long vehiclerentalid;

	public VehicleRentCustomerLink() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (custid ^ (custid >>> 32));
		result = prime * result + (int) (vehiclerentalid ^ (vehiclerentalid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleRentCustomerLink other = (VehicleRentCustomerLink) obj;
		if (custid != other.custid)
			return false;
		if (vehiclerentalid != other.vehiclerentalid)
			return false;
		return true;
	}

	public long getCustid() {
		return custid;
	}

	public void setCustid(long custid) {
		this.custid = custid;
	}

	public long getVehiclerentalid() {
		return vehiclerentalid;
	}

	public void setVehiclerentalid(long vehiclerentalid) {
		this.vehiclerentalid = vehiclerentalid;
	}

	public VehicleRentCustomerLink(long custid, long vehiclerentalid) {
		super();
		this.custid = custid;
		this.vehiclerentalid = vehiclerentalid;
	}

	@Override
	public String toString() {
		return "VehicleRentCustomerLink [custid=" + custid + ", vehiclerentalid=" + vehiclerentalid + "]";
	}

	
}


package com.github.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiclerent")
public class VehicleRent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long vehiclerentalid;

		@Column(name="vehicleid")
		private int vehicleid;

	@Column(name = "hiredate")
	private String hiredate;
	@Column(name = "duedate")
	private String duedate;
	@Column(name = "comments ")
	private String comments;
	
	
	public VehicleRent() {
		super();
		
	}

	public VehicleRent(long vehiclerentalid, int vehicleid, String hiredate, String duedate, String comments) {
		super();
		this.vehiclerentalid = vehiclerentalid;
		this.vehicleid = vehicleid;
		this.hiredate = hiredate;
		this.duedate = duedate;
		this.comments = comments;
	}

	

	public long getVehiclerentalid() {
		return vehiclerentalid;
	}

	public void setVehiclerentalid(long vehiclerentalid) {
		this.vehiclerentalid = vehiclerentalid;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "VehicleRent [vehiclerentalid=" + vehiclerentalid + ", vehicleid=" + vehicleid + ", hiredate=" + hiredate
				+ ", duedate=" + duedate + ", comments=" + comments + "]";
	}



	

	

}

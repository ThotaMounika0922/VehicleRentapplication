package com.github.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="vehicletype")

public class VehicleType {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "vehicletypeid")
private long vehicletypeid;
@Column(name = "vehicletypedescription")
private String vehicletypedescription;
@Column(name = "vehicletypecode")
public String vehicletypecode;

public VehicleType() {
	super();
	// TODO Auto-generated constructor stub
}
public long getVehicletypeid() {
	return vehicletypeid;
}
public void setVehicletypeid(long vehicletypeid) {
	this.vehicletypeid = vehicletypeid;
}
public String getVehicletypedescription() {
	return vehicletypedescription;
}
public void setVehicletypedescription(String vehicletypedescription) {
	this.vehicletypedescription = vehicletypedescription;
}
public String getVehicletypecode() {
	return vehicletypecode;
}
public void setVehicletypecode(String vehicletypecode) {
	this.vehicletypecode = vehicletypecode;
}
public VehicleType(long vehicletypeid, String vehicletypedescription, String vehicletypecode) {
	super();
	this.vehicletypeid = vehicletypeid;
	this.vehicletypedescription = vehicletypedescription;
	this.vehicletypecode = vehicletypecode;
}
@Override
public String toString() {
	return "VehicleType [vehicletypeid=" + vehicletypeid + ", vehicletypedescription=" + vehicletypedescription
			+ ", vehicletypecode=" + vehicletypecode + "]";
}




}

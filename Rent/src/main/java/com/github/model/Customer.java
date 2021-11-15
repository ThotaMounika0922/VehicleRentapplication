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

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Custid")
	private long custid;
	@Column(name = "custfirstname")
	private String custfirstname;

	@Column(name = "custlastname")
	private String custlastname;
	@Column(name = "emailid")
	private String emailid;
	@Column(name = "password")
	private String password;
	@Column(name = "phonenumber")
	private int phonenumber;
	@Column(name = "Address")
	private String Address;

	public Customer() {

	}

	public long getCustid() {
		return custid;
	}

	public void setCustid(long custid) {
		this.custid = custid;
	}

	public String getCustfirstname() {
		return custfirstname;
	}

	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}

	public String getCustlastname() {
		return custlastname;
	}

	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Customer(long custid, String custfirstname, String custlastname, String emailid, String password,
			int phonenumber, String address) {
		super();
		this.custid = custid;
		this.custfirstname = custfirstname;
		this.custlastname = custlastname;
		this.emailid = emailid;
		this.password = password;
		this.phonenumber = phonenumber;
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname=" + custlastname
				+ ", emailid=" + emailid + ", password=" + password + ", phonenumber=" + phonenumber + ", Address="
				+ Address + "]";
	}

	
}


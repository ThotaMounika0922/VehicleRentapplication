package com.github.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.model.VehicleRentCustomerLink;
import com.github.model.VehicleType;
@Repository
public interface VehicleRentCustomerLinkRepository extends  JpaRepository<VehicleRentCustomerLink,Long>{

//	List<VehicleRentCustomerLink> findByCustomer(long custid);

	List<VehicleRentCustomerLink> findBycustid(long custid);

}

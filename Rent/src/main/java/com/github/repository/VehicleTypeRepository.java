package com.github.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.github.model.VehicleType;
@Repository
public interface VehicleTypeRepository  extends JpaRepository<VehicleType,Long> {

//	VehicleType findById(long vehicletypeid);

	//VehicleType findById(long vehicletypeid);

//	Optional<VehicleType> findById(long vehicletypeId);

}

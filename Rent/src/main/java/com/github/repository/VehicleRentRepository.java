package com.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.model.VehicleRent;
@Repository
public interface VehicleRentRepository extends JpaRepository<VehicleRent, Long> {

}

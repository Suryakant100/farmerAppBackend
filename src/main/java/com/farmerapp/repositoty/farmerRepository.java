package com.farmerapp.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmerapp.models.Farmer;

public interface farmerRepository extends JpaRepository<Farmer, String> {

}

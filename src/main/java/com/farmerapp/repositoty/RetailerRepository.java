package com.farmerapp.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmerapp.models.Retailer;

public interface RetailerRepository extends JpaRepository<Retailer, Integer> {

}

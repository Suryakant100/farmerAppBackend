package com.farmerapp.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmerapp.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	public Supplier findSupplierByEmail(String email);
}

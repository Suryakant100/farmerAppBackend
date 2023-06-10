package com.farmerapp.supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	public Supplier findSupplierByEmail(String email);
}

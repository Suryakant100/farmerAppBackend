package com.farmerapp.repositoty;

import org.springframework.data.repository.CrudRepository;

import com.farmerapp.models.Product;



public interface ProductRepository extends CrudRepository<Product, Integer> {

	
	
}


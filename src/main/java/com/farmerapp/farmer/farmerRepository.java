package com.farmerapp.farmer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface farmerRepository extends JpaRepository<Farmer, String> {

}

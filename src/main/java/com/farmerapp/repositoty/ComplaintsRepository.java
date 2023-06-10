package com.farmerapp.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmerapp.models.Complaints;

public interface ComplaintsRepository extends JpaRepository<Complaints, Integer> {

}

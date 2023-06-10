package com.farmerapp.complaints;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsRepository extends JpaRepository<Complaints, Integer> {

}

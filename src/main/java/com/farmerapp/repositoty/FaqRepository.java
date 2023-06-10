package com.farmerapp.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmerapp.models.Faq;

public interface FaqRepository extends JpaRepository<Faq, Integer> {

}

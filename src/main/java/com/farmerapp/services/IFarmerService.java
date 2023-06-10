package com.farmerapp.services;

import java.util.List;

import com.farmerapp.models.Complaints;
import com.farmerapp.models.Farmer;

public interface IFarmerService {

	public Farmer addFarmer(Farmer farmer);
	public Farmer getUserByNameAndPassword(String email, String password);
	public List<Complaints> gatAllComplaintsByFarmer(String email);
}

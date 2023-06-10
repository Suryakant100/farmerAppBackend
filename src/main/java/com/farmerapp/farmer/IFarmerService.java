package com.farmerapp.farmer;

import java.util.List;

import com.farmerapp.complaints.Complaints;

public interface IFarmerService {

	public Farmer addFarmer(Farmer farmer);
	public Farmer getUserByNameAndPassword(String email, String password);
	public List<Complaints> gatAllComplaintsByFarmer(String email);
}

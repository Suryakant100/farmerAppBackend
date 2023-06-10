package com.farmerapp.services;

import java.util.List;

import com.farmerapp.exception.DealerNotFoundException;
import com.farmerapp.models.Complaints;



public interface IComplaintsService {
	public Complaints insertComplaints(Complaints complaints) throws DealerNotFoundException;
	public Complaints updateCompaints(Complaints complaints);
	public Complaints deletComplaints(Complaints complaints);
	public List<Complaints> allCompaintsList();
}

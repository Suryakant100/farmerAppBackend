package com.farmerapp.complaints;

import java.util.List;

import com.farmerapp.supplier.DealerNotFoundException;



public interface IComplaintsService {
	public Complaints insertComplaints(Complaints complaints) throws DealerNotFoundException;
	public Complaints updateCompaints(Complaints complaints);
	public Complaints deletComplaints(Complaints complaints);
	public List<Complaints> allCompaintsList();
}

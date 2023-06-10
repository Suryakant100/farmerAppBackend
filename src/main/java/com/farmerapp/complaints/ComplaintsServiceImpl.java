package com.farmerapp.complaints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmerapp.farmer.Farmer;
import com.farmerapp.farmer.farmerRepository;
import com.farmerapp.supplier.DealerNotFoundException;
import com.farmerapp.supplier.Supplier;
import com.farmerapp.supplier.SupplierRepository;

@Service
public class ComplaintsServiceImpl implements IComplaintsService {

	@Autowired
	ComplaintsRepository complainRepo;

	@Autowired
	farmerRepository farmerRepo;
	
	@Autowired
	SupplierRepository supplierRepo;

	@Autowired
	Farmer farmer;

	@Autowired
	Complaints complain;

	@Override
	public Complaints insertComplaints(Complaints complaints)throws DealerNotFoundException {

		Farmer f1 = complaints.getFarmer();
		farmer = farmerRepo.findById(f1.getFarmerEmail()).get();
		
		Supplier supplier = supplierRepo.findSupplierByEmail(complaints.getDealerEmail());
		
		
		if(supplier!=null) {
			Complaints c1= new Complaints();
			c1.setDealerEmail(complaints.getDealerEmail());
			c1.setEmailId(complaints.getEmailId());
			c1.setMeassage(complaints.getMeassage());
			c1.setName(complaints.getName());
			c1.setFarmer(farmer);
			complainRepo.save(c1);
			farmerRepo.save(farmer);
			
			return complaints;
		} 
		
		throw new DealerNotFoundException("Please Enter Valid Dealer Email!");
	}

	@Override
	public Complaints updateCompaints(Complaints complaints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Complaints deletComplaints(Complaints complaints) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Complaints> allCompaintsList() {
		List<Complaints> complais= complainRepo.findAll();
		System.out.println(complais);
		return complais;
	}

}

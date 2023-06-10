package com.farmerapp.complaints;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmerapp.supplier.DealerNotFoundException;



@Validated
@RestController
@RequestMapping("/compliants")
@CrossOrigin
public class ComplaintsController {
	
	@Autowired
	IComplaintsService complainService;
	
	@PostMapping("/addCompliants")
	public Complaints addComplaint(@RequestBody @Valid Complaints compliants) throws DealerNotFoundException {
		
		return  complainService.insertComplaints(compliants);
		
	}
	@GetMapping("/allcomplains")
	public ResponseEntity<List<Complaints>> getAllUsers() {
		return new ResponseEntity<List<Complaints>>(complainService.allCompaintsList(), HttpStatus.OK);
	}
}

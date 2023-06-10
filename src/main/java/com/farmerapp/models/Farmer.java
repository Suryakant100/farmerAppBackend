package com.farmerapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Getter
@Setter
@Controller
@Entity
@Table(name = "farmer_details")
public class Farmer {

	private String farmerName;
	@Id
	private String farmerEmail;
	private String password; 
	private Long phone;
	private String address;
	
	@OneToMany(mappedBy = "farmer")
	@JsonIgnore
	private List<Complaints> complains;
	
	@OneToMany(mappedBy = "farmer")
	@JsonIgnore
	private List<Supplier> suppliers;
}

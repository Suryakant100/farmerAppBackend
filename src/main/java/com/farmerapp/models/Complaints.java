package com.farmerapp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;

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
@Entity
@Controller
@Table(name = "complaints_details")
public class Complaints {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer complainId;
	private String dealerEmail; 
	private String name;
	 
	@NotNull
	private String emailId; 
	private String meassage; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "farmer_email")
	private Farmer farmer;
	 
}

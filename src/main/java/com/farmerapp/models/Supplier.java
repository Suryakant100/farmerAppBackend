package com.farmerapp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.checkerframework.common.aliasing.qual.Unique;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "supplier_details")
public class Supplier {
	@Id
	private Integer supplierId;
	
	private Long phone;
	private String supplierName;
	@Unique
	@NotBlank
	private String email;
	
	private String password;
	
	@ManyToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "farmer_email")
	private Farmer farmer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;
}

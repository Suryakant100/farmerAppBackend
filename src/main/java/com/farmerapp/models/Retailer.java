package com.farmerapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "retailer_details")
public class Retailer {
	@Id
    private Integer retailerId;
	
	private String retailerName;
	
	private Long phone;
	@Unique
	@NotBlank
	private String email;
	
	private String  password;
}

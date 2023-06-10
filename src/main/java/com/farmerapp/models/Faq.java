package com.farmerapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name = "faq_details")
public class Faq {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer faqId;
	private String question;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}

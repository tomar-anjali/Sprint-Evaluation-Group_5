package com.evaluation.petshop.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "addresses")
@Data

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	private String street;
	private String city;
	private String state;
	@Column(name = "zip_code")
	private String zipCode;

	// To avoid redundancy (Column)
	@OneToMany(mappedBy = "address")
	private List<Customer> customers;

	// To avoid redundancy (Column)
	@OneToMany(mappedBy = "address")
	private List<Supplier> suppliers;
	
	@OneToMany(mappedBy = "address")
	private List<Employee> employees;

}

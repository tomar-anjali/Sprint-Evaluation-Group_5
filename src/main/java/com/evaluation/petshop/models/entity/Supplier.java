package com.evaluation.petshop.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "suppliers")
@Data
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private int supplierId;
	private String name;
	private String contact_person;
	@Column(name = "phone_number")
	private String phoneNumber;
	private String email;

	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	// To avoid redundancy (Table)
	@ManyToMany(mappedBy = "suppliers")
	private List<Pet> pets;

}

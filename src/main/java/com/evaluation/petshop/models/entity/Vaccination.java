package com.evaluation.petshop.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "vaccinations")
@Data
public class Vaccination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vaccination_id")
	private int vaccinationId;
	private String name;
	private String description;
	private double price;
	private boolean available;

	// To avoid redundancy (Table)
	@ManyToMany(mappedBy = "vaccinations")
	private List<Pet> pets;

}

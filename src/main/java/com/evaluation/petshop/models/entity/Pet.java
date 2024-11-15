package com.evaluation.petshop.models.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pets")
@Data
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_id")
	private int petId;
	private String name;
	private String breed;
	private int age;
	private double price;
	private String description;
	@Column(name = "image_url")
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private PetCategory petCategory;

	@ManyToMany
	/*
	 * This is used for many-to-many relationships to avoid the need for manually
	 * creating and managing a third table.
	 */
	@JoinTable(name = "pet_grooming_relationship", joinColumns = @JoinColumn(name = "pet_id"), inverseJoinColumns = @JoinColumn(name = "service_id"))
	private List<GroomingService> groomingService;

	@ManyToMany
	@JoinTable(name = "pet_vaccination_relationship", joinColumns = @JoinColumn(name = "pet_id"), inverseJoinColumns = @JoinColumn(name = "vaccination_id"))
	private List<Vaccination> vaccinations;

	// To avoid redundancy (Column)
	@OneToMany(mappedBy = "pet")
	private List<Transaction> transactions;

	@ManyToMany
	@JoinTable(name = "pet_food_relationship", joinColumns = @JoinColumn(name = "pet_id"), inverseJoinColumns = @JoinColumn(name = "food_id"))
	private List<PetFood> petfood;
	
	@ManyToMany
	@JoinTable(name = "pet_supplier_relationship", joinColumns = @JoinColumn(name = "pet_id"), inverseJoinColumns = @JoinColumn(name = "supplier_id"))
	private List<Supplier> suppliers;
	
	@ManyToMany(mappedBy = "pets")
	private List<Employee> employees;
	

}

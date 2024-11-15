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
@Table(name = "grooming_services")
@Data
public class GroomingService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private int serviceId;
	private String name;
	private String description;
	private double price;
	private boolean available;
	
	//To avoid redundancy (Table)
	@ManyToMany(mappedBy = "groomingService")
	private List<Pet> pets;
	
	
}

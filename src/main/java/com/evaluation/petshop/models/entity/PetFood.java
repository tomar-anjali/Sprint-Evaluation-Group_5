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
@Table(name = "pet_food")
@Data
public class PetFood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "food_id")
	private int foodId;
	private String name;
	private String brand;
	private String type;
	private int quantity;
	private double price;

	// To avoid redundancy (Table)
	@ManyToMany(mappedBy = "petfood")
	private List<Pet> pets;
}

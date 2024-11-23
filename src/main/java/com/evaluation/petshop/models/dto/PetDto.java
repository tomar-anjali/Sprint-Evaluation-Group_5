package com.evaluation.petshop.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDto {
	private String name;
	private String breed;
	private int age;
	private double price;
	private String description;
	private String imageUrl;
	private int petCategoryId;
}

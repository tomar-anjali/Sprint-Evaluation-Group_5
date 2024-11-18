package com.evaluation.petshop.models.dto;

import lombok.Data;

@Data
public class PetDto {
	private String name;
	private String breed;
	private int age;
	private double price;
	private String description;
	private String imageUrl;
}

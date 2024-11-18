package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class PetResponseDto {
	private int petId;
	private String name;
	private String breed;
	private int age;
	private double price;
	private String description;
	private String imageUrl;
	private PetCategoryResponseDto petCategory;
}

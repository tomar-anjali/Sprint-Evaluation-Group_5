package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class PetFoodResponseDto {
	private int foodId;
	private String name;
	private String brand;
	private String type;
	private int quantity;
	private double price;
}

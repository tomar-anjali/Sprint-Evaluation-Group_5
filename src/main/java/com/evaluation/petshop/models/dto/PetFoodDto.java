package com.evaluation.petshop.models.dto;

import lombok.Data;

@Data
public class PetFoodDto {
	private String name;
	private String brand;
	private String type;
	private int quantity;
	private double price;
}

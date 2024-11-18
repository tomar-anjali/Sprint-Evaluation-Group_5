package com.evaluation.petshop.models.dto;

import lombok.Data;

@Data
public class VaccinationDto {
	private String name;
	private String description;
	private double price;
	private boolean available;
}

package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class VaccinationResponseDto {
	private int vaccinationId;
	private String name;
	private String description;
	private double price;
	private boolean available;
}

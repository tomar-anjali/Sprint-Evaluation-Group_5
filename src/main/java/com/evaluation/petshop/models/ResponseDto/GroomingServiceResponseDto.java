package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class GroomingServiceResponseDto {
	private int serviceId;
	private String name;
	private String description;
	private double price;
	private boolean available;
}

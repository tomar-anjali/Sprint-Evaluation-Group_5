package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class AddressResponseDto {
	private int addressId;
	private String street;
	private String city;
	private String state;
	private String zipCode;
}

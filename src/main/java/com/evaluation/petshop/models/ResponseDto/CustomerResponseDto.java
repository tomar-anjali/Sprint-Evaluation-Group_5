package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class CustomerResponseDto {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private AddressResponseDto address;
}

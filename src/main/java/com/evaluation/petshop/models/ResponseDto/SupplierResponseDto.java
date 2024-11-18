package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class SupplierResponseDto {
	private int supplierId;
	private String name;
	private String contactPerson;
	private String phoneNumber;
	private String email;
	private AddressResponseDto address;
}

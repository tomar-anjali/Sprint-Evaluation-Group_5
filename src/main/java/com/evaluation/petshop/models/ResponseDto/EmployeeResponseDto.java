package com.evaluation.petshop.models.ResponseDto;

import lombok.Data;

@Data
public class EmployeeResponseDto {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String position;
	private String hireDate;
	private String phoneNumber;
	private String email;
	private AddressResponseDto address;
}

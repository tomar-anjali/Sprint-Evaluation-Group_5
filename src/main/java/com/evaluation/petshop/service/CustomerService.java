package com.evaluation.petshop.service;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {
	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,String lastName);
}

package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {
	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,
			String lastName);

	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();
}

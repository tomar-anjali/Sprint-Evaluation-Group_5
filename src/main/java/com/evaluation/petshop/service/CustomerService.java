package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {

	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(int customerId);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId, CustomerDto customerDto);

	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String first_name,
			String last_name);

	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();

	//ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getCustomerByName(String name);

}

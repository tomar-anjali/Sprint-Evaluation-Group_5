package com.evaluation.petshop.service;


import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {


	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(int customerId);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId, CustomerDto customerDto);

	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto);

}

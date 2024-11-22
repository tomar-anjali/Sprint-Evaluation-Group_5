package com.evaluation.petshop.service;

<<<<<<< HEAD

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface CustomerService {


	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(int customerId);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId, CustomerDto customerDto);

	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto);

=======

=======
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
public interface CustomerService {
	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,String lastName);
	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

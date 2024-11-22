package com.evaluation.petshop.service;

<<<<<<< HEAD
=======
import java.util.List;

import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
public interface CustomerService {

	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(int customerId);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId, CustomerDto customerDto);

	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto);

	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String first_name,
			String last_name);

	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();

}

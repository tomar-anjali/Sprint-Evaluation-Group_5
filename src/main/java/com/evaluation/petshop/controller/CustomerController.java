package com.evaluation.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.CustomerService;


@RequestMapping("/customers")
@RestController
public class CustomerController {
<<<<<<< HEAD
	
=======
	@Autowired
	private CustomerService customerService;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

	@GetMapping("/name/{first_name}/{last_name}")
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(
			@PathVariable String first_name, @PathVariable String last_name) {
		return customerService.getCustomerByFirstAndLastName(first_name, last_name);
	}
	@GetMapping()
	public ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer() {
		return customerService.getAllCustomer();
	}
}

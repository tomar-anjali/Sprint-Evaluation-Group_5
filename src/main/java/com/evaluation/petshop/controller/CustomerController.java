package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.CustomerService;

@RequestMapping("/customers")
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping()
	public ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer(){
		return customerService.getAllCustomer();
	}
}

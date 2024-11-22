package com.evaluation.petshop.controller;

<<<<<<< HEAD

=======
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
=======
import java.util.List;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.CustomerService;


import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
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

<<<<<<< HEAD
	@Autowired
	private CustomerService customerService;

	@GetMapping("/{customerId}")
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(@PathVariable int customerId){
		return customerService.getCustomerById(customerId);
	}
	@PutMapping("/update/{customerId}")
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(@PathVariable int customerId,@RequestBody CustomerDto customerDto){
		return customerService.updateCustomer(customerId,customerDto);
	}
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(@RequestBody CustomerDto customerDto){
		return customerService.saveCustomer(customerDto);
=======
	@GetMapping("/name/{first_name}/{last_name}")
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(
			@PathVariable String first_name, @PathVariable String last_name) {
		return customerService.getCustomerByFirstAndLastName(first_name, last_name);
	}
	@GetMapping()
	public ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer() {
		return customerService.getAllCustomer();
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
	}
}

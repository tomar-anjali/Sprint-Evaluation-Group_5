package com.evaluation.petshop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,
			String lastName) {
		Customer customer = customerDao.getCustomerByFirstAndLastName(firstName, lastName);

		AddressResponseDto addressResponseDto = new AddressResponseDto();
		if (customer.getAddress() != null) {
			addressResponseDto.setAddressId(customer.getAddress().getAddressId());
			addressResponseDto.setStreet(customer.getAddress().getStreet());
			addressResponseDto.setCity(customer.getAddress().getCity());
			addressResponseDto.setState(customer.getAddress().getState());
			addressResponseDto.setZipCode(customer.getAddress().getZipCode());
		}

		CustomerResponseDto customerResponseDto = new CustomerResponseDto();
		customerResponseDto.setFirstName(customer.getFirstName());
		customerResponseDto.setLastName(customer.getLastName());
		customerResponseDto.setEmail(customer.getEmail());
		customerResponseDto.setCustomerId(customer.getCustomerId());
		customerResponseDto.setPhoneNumber(customer.getPhoneNumber());
		customerResponseDto.setAddress(addressResponseDto);

		ResponseStructure<CustomerResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(customerResponseDto);

		return new ResponseEntity<>(response, HttpStatus.FOUND);
	}
}

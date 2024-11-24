package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.CustomerDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerById(int customerId) {
		Customer customer = customerDao.getCustomerById(customerId);
		AddressResponseDto addressResponseDto = new AddressResponseDto();
		if (customer.getAddress() != null) {
			addressResponseDto.setAddressId(customer.getAddress().getAddressId());
			addressResponseDto.setStreet(customer.getAddress().getStreet());
			addressResponseDto.setCity(customer.getAddress().getCity());
			addressResponseDto.setState(customer.getAddress().getState());
			addressResponseDto.setZipCode(customer.getAddress().getZipCode());
		}
		CustomerResponseDto customerResponseDto = new CustomerResponseDto();
		customerResponseDto.setCustomerId(customer.getCustomerId());
		customerResponseDto.setFirstName(customer.getFirstName());
		customerResponseDto.setLastName(customer.getLastName());
		customerResponseDto.setEmail(customer.getEmail());
		customerResponseDto.setPhoneNumber(customer.getPhoneNumber());

		ResponseStructure<CustomerResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(customerResponseDto);
		return new ResponseEntity<>(response, HttpStatus.FOUND);
	}

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
		customerResponseDto.setCustomerId(customer.getCustomerId());
		customerResponseDto.setFirstName(customer.getFirstName());
		customerResponseDto.setLastName(customer.getLastName());
		customerResponseDto.setEmail(customer.getEmail());
		customerResponseDto.setPhoneNumber(customer.getPhoneNumber());

		ResponseStructure<CustomerResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(customerResponseDto);
		return new ResponseEntity<>(response, HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId,
			CustomerDto customerDto) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setEmail(customerDto.getEmail());
		customer.setPhoneNumber(customerDto.getPhoneNumber());

		Customer updateCustomer = customerDao.updateCustomer(customerId, customer);
		CustomerResponseDto customerResponseDto = new CustomerResponseDto();
		customerResponseDto.setCustomerId(updateCustomer.getCustomerId());
		customerResponseDto.setFirstName(updateCustomer.getFirstName());
		customerResponseDto.setLastName(updateCustomer.getLastName());
		customerResponseDto.setEmail(updateCustomer.getEmail());
		customerResponseDto.setPhoneNumber(updateCustomer.getPhoneNumber());

		ResponseStructure<CustomerResponseDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Customer updated successfully");
		responseStructure.setData(customerResponseDto);
		return new ResponseEntity<>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto) {
		// convert Dto to entity
		Customer customer = new Customer();
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setEmail(customerDto.getEmail());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		// save the category
		Customer savedCustomer = customerDao.saveCustomer(customer);
		// covert the saved entity back to DTO
		CustomerDto savedCustomerDto = new CustomerDto();
		savedCustomerDto.setFirstName(savedCustomer.getFirstName());
		savedCustomerDto.setLastName(savedCustomer.getLastName());
		savedCustomerDto.setEmail(savedCustomer.getEmail());
		savedCustomerDto.setPhoneNumber(savedCustomer.getPhoneNumber());

		// prepare the response structure
		ResponseStructure<CustomerDto> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Customer created successfully");
		responseStructure.setData(savedCustomerDto);
		return new ResponseEntity<>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer() {
		List<Customer> customers = customerDao.getAllCustomer();

		List<CustomerResponseDto> customerResponseDtos = customers.stream().map(data -> {
			AddressResponseDto addressResponseDto = new AddressResponseDto();
			if (data.getAddress() != null) {
				addressResponseDto.setAddressId(data.getAddress().getAddressId());
				addressResponseDto.setStreet(data.getAddress().getStreet());
				addressResponseDto.setCity(data.getAddress().getCity());
				addressResponseDto.setState(data.getAddress().getState());
				addressResponseDto.setZipCode(data.getAddress().getZipCode());
			}
			CustomerResponseDto dtos = new CustomerResponseDto();
			dtos.setCustomerId(data.getCustomerId());
			dtos.setFirstName(data.getFirstName());
			dtos.setLastName(data.getLastName());
			dtos.setEmail(data.getEmail());
			dtos.setPhoneNumber(data.getPhoneNumber());
			dtos.setAddress(addressResponseDto);
			return dtos;
		}).collect(Collectors.toList());

		ResponseStructure<List<CustomerResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(customerResponseDtos);
		return new ResponseEntity<ResponseStructure<List<CustomerResponseDto>>>(responseStructure, HttpStatus.FOUND);
	}
}
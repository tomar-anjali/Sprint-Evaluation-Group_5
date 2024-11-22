package com.evaluation.petshop.service.implementation;


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
		Customer customer=customerDao.getCustomerById(customerId);
		AddressResponseDto addressResponseDto=new AddressResponseDto();
		if(customer.getAddress()!=null) {
			addressResponseDto.setAddressId(customer.getAddress().getAddressId());
			addressResponseDto.setStreet(customer.getAddress().getStreet());
			addressResponseDto.setCity(customer.getAddress().getCity());
			addressResponseDto.setState(customer.getAddress().getState());
			addressResponseDto.setZipCode(customer.getAddress().getZipCode());
		}
		CustomerResponseDto customerResponseDto= new CustomerResponseDto();
		customerResponseDto.setCustomerId(customer.getCustomerId());
		customerResponseDto.setFirstName(customer.getFirstName());
		customerResponseDto.setLastName(customer.getLastName());
		customerResponseDto.setEmail(customer.getEmail());
		customerResponseDto.setPhoneNumber(customer.getPhoneNumber());
		
		
		ResponseStructure<CustomerResponseDto> response=new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(customerResponseDto);
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<CustomerResponseDto>> updateCustomer(int customerId, CustomerDto customerDto) {
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setEmail(customerDto.getEmail());
		customer.setPhoneNumber(customerDto.getPhoneNumber());
		
		
		Customer updateCustomer=customerDao.updateCustomer(customerId,customer);
		CustomerResponseDto customerResponseDto=new CustomerResponseDto();
		customerResponseDto.setCustomerId(updateCustomer.getCustomerId());
		customerResponseDto.setFirstName(updateCustomer.getFirstName());
		customerResponseDto.setLastName(updateCustomer.getLastName());
		customerResponseDto.setEmail(updateCustomer.getEmail());
		customerResponseDto.setPhoneNumber(updateCustomer.getPhoneNumber());
		
		
		ResponseStructure<CustomerResponseDto> responseStructure= new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Customer updated successfully");
		responseStructure.setData(customerResponseDto);
		return new ResponseEntity<>(responseStructure,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<CustomerDto>> saveCustomer(CustomerDto customerDto) {
		//convert Dto to entity
       Customer customer= new Customer();
       customer.setFirstName(customerDto.getFirstName());
       customer.setLastName(customerDto.getLastName());
       customer.setEmail(customerDto.getEmail());
       customer.setPhoneNumber(customerDto.getPhoneNumber());
       //save the category
       Customer savedCustomer= customerDao.saveCustomer(customer);
       //covert the saved entity back to DTO
       CustomerDto savedCustomerDto= new CustomerDto();
       savedCustomerDto.setFirstName(savedCustomer.getFirstName());
       savedCustomerDto.setLastName(savedCustomer.getLastName());
       savedCustomerDto.setEmail(savedCustomer.getEmail());
       savedCustomerDto.setPhoneNumber(savedCustomer.getPhoneNumber());
       
       //prepare the response structure
       ResponseStructure<CustomerDto> responseStructure= new ResponseStructure<>();
       responseStructure.setStatusCode(HttpStatus.CREATED.value());
       responseStructure.setMessage("Customer created successfully");
       responseStructure.setData(savedCustomerDto);
       return new ResponseEntity<>(responseStructure,HttpStatus.CREATED);
	}



}

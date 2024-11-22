package com.evaluation.petshop.dao.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.repository.CustomerRepository;

@Repository
public class CustomerDaoImplementation implements CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
		return optionalCustomer.orElseThrow(() -> new DataNotFoundException("Validation Failed"));

	}

	@Override
	public Customer updateCustomer(int customerId, Customer updatecustomer) {
		Optional<Customer> customerOptional = customerRepository.findById(customerId);
		if (customerOptional.isPresent()) {
			Customer customer = customerOptional.get();
			customer.setFirstName(updatecustomer.getFirstName());
			customer.setLastName(updatecustomer.getLastName());
			customer.setEmail(updatecustomer.getEmail());
			customer.setPhoneNumber(updatecustomer.getPhoneNumber());

			return customerRepository.save(customer);
		} else {
			throw new DataNotFoundException("Customer found for update");
		}
	}

	@Override
	public Customer saveCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerByFirstAndLastName(String firstName, String lastName) {
		return customerRepository.findAll().stream()
				.filter(Name -> Name.getFirstName().contains(firstName) && Name.getLastName().contains(lastName))
				.findFirst().orElseThrow(() -> new DataNotFoundException("Validation failed"));
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
}

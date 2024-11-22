package com.evaluation.petshop.dao.implementation;

import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.repository.CustomerRepository;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
	@Autowired
	private CustomerRepository customerRepository;

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

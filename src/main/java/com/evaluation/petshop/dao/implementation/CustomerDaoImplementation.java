package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD

import org.springframework.stereotype.Repository;
=======
import java.util.List;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.repository.CustomerRepository;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
<<<<<<< HEAD
	

=======
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
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
}

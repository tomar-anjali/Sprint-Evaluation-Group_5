package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Customer;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {
	Customer getCustomerByFirstAndLastName(String firstName, String lastName);

<<<<<<< HEAD
	Customer getCustomerById(int customerId);
	public Customer updateCustomer(int customerId,Customer customer);
	Customer saveCustomer(Customer customer);
=======
	List<Customer> getAllCustomer();
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

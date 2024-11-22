package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {

	Customer getCustomerByFirstAndLastName(String firstName, String lastName);

	Customer getCustomerById(int customerId);

	public Customer updateCustomer(int customerId, Customer customer);

	Customer saveCustomer(Customer customer);

	List<Customer> getAllCustomer();
}

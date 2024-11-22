package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {
	Customer getCustomerByFirstAndLastName(String firstName, String lastName);

	List<Customer> getAllCustomer();
}

package com.evaluation.petshop.dao;


import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {

	Customer getCustomerById(int customerId);
	public Customer updateCustomer(int customerId,Customer customer);
	Customer saveCustomer(Customer customer);
}

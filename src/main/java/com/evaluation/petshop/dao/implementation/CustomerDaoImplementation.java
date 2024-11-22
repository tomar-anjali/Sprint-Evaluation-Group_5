package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.CustomerDao;
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.repository.CustomerRepository;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
}

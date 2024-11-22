package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {
	Customer getCustomerByFirstAndLastName(String firstName, String lastName);
}

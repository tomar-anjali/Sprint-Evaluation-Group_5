package com.evaluation.petshop.dao;

<<<<<<< HEAD
import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {
	Customer getCustomerByFirstAndLastName(String firstName, String lastName);
=======
import java.util.List;

import com.evaluation.petshop.models.entity.Customer;

public interface CustomerDao {
	List<Customer> getAllCustomer();
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
}

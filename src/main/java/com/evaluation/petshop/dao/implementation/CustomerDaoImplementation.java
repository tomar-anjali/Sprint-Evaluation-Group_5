package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.CustomerDao;
<<<<<<< HEAD
import com.evaluation.petshop.exception.DataNotFoundException;
=======
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
import com.evaluation.petshop.models.entity.Customer;
import com.evaluation.petshop.repository.CustomerRepository;

@Repository
public class CustomerDaoImplementation implements CustomerDao {
	@Autowired
	private CustomerRepository customerRepository;
<<<<<<< HEAD

	@Override
	public Customer getCustomerByFirstAndLastName(String firstName, String lastName) {
		return customerRepository.findAll().stream()
				.filter(Name -> Name.getFirstName().contains(firstName) && Name.getLastName().contains(lastName))
				.findFirst().orElseThrow(() -> new DataNotFoundException("Validation failed"));
	}
}
=======
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}
}
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8

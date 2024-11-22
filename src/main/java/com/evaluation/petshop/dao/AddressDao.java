package com.evaluation.petshop.dao;

<<<<<<< HEAD
import java.util.List;

import com.evaluation.petshop.models.entity.Address;

public interface AddressDao {
	List<Address> getAllAddressesList();

=======
import com.evaluation.petshop.models.entity.Address;

public interface AddressDao {
	Address getAddressById(int customerId);
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

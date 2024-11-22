package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Address;

public interface AddressDao {
	List<Address> getAllAddressesList();

	Address getAddressById(int customerId);
}

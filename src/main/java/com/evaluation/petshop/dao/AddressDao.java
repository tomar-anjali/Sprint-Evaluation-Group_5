package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.Address;

public interface AddressDao {
	Address getAddressById(int customerId);
}

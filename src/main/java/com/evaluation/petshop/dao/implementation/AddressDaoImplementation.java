package com.evaluation.petshop.dao.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.AddressDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Address;
import com.evaluation.petshop.repository.AddressRepository;

@Repository
public class AddressDaoImplementation implements AddressDao {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address getAddressById(int addressId) {
		Optional<Address> address = addressRepository.findById(addressId);
		if (address.isPresent())
			return address.get();
		else
			throw new DataNotFoundException("Validation failed");

	}
}

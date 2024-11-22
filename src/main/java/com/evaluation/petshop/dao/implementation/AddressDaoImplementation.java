package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.Optional;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.AddressDao;
<<<<<<< HEAD
=======
import com.evaluation.petshop.exception.DataNotFoundException;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import com.evaluation.petshop.models.entity.Address;
import com.evaluation.petshop.repository.AddressRepository;

@Repository
public class AddressDaoImplementation implements AddressDao {
	@Autowired
	private AddressRepository addressRepository;

<<<<<<< HEAD
	@Autowired
	private AddressRepository addressRepository;
	@Override
    public List<Address> getAllAddressesList(){
        return addressRepository.findAll();
    }


=======
	@Override
	public Address getAddressById(int addressId) {
		Optional<Address> address = addressRepository.findById(addressId);
		if (address.isPresent())
			return address.get();
		else
			throw new DataNotFoundException("Validation failed");

	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

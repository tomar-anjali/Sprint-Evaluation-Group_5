package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.AddressDao;
import com.evaluation.petshop.models.entity.Address;
import com.evaluation.petshop.repository.AddressRepository;

@Repository
public class AddressDaoImplementation implements AddressDao {

	@Autowired
	private AddressRepository addressRepository;
	@Override
    public List<Address> getAllAddressesList(){
        return addressRepository.findAll();
    }


}

package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.SupplierDao;
import com.evaluation.petshop.models.entity.Supplier;
import com.evaluation.petshop.repository.SupplierRepository;

@Repository
public class SupplierDaoImplementation implements SupplierDao {
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public List<Supplier> getAllSuppliers() {

		return supplierRepository.findAll();
	}

}

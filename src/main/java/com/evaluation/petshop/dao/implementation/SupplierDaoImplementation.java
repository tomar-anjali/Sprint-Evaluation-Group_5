package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.Optional;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.SupplierDao;
<<<<<<< HEAD
=======
import com.evaluation.petshop.exception.DataNotFoundException;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.Supplier;
import com.evaluation.petshop.repository.SupplierRepository;

@Repository
public class SupplierDaoImplementation implements SupplierDao {
	@Autowired
	private SupplierRepository supplierRepository;
<<<<<<< HEAD

	@Override
	public List<Supplier> getAllSuppliers() {

		return supplierRepository.findAll();
	}
=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@Override
	public Supplier getSupplierBySupplierId(int id) {
		Optional<Supplier> res = supplierRepository.findById(id);
		if (res.isPresent()) {
			return res.get();
		} else {
			throw new DataNotFoundException("Validation failed");
		}
	}
}

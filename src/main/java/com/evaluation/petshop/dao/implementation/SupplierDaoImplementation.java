package com.evaluation.petshop.dao.implementation;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.SupplierDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Supplier;
import com.evaluation.petshop.repository.SupplierRepository;

@Repository
public class SupplierDaoImplementation implements SupplierDao {
	@Autowired
	private SupplierRepository supplierRepository;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	@Override
	public List<Supplier> getAllSuppliers() {
		return supplierRepository.findAll();
	}
<<<<<<< HEAD
=======

>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
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

package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierDao {
<<<<<<< HEAD
=======
	List<Supplier> getAllSuppliers();

public interface SupplierDao {
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	
	Supplier getSupplierBySupplierId(int id);

	List<Supplier> getAllSuppliers();
}

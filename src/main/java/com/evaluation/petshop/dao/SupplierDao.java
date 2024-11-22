package com.evaluation.petshop.dao;

<<<<<<< HEAD
import java.util.List;

import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierDao {
	List<Supplier> getAllSuppliers();
=======
import com.evaluation.petshop.models.entity.Supplier;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

public interface SupplierDao {
	
	Supplier getSupplierBySupplierId(int id);
}

package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierDao {
	List<Supplier> getAllSuppliers();
	Supplier getSupplierBySupplierId(int id);

}

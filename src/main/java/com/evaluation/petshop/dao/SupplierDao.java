package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierDao {
	
	Supplier getSupplierBySupplierId(int id);

	List<Supplier> getAllSuppliers();
}

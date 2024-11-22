package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierDao {
	Supplier getSupplierBySupplierId(int id);
}

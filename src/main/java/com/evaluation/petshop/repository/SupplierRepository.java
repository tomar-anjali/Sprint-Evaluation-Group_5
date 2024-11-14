package com.evaluation.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaluation.petshop.models.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}

package com.evaluation.petshop.service;

<<<<<<< HEAD
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;

public interface SupplierService {
	ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers();
=======
import org.springframework.http.ResponseEntity;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface SupplierService {
	ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id);
}

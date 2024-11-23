package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;

public interface SupplierService {
	ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id);

	ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers();
}

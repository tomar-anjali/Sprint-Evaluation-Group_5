package com.evaluation.petshop.service;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface SupplierService {
	ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id);
}

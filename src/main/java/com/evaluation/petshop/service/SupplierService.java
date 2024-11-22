package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;

public interface SupplierService {
  ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers();
	ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id);
}

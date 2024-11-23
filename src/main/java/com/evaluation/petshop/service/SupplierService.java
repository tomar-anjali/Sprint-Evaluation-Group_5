package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;

public interface SupplierService {
=======
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;

public interface SupplierService {
  ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers();
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(int id);

	ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers();
}

package com.evaluation.petshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;
import com.evaluation.petshop.service.SupplierService;

@RequestMapping("/suppliers")
@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	@GetMapping
	public ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers() {
		return supplierService.getAllSuppliers();
	}
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(@PathVariable int id) {
		return supplierService.getSupplierBySupplierId(id);
	}
}

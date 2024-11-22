package com.evaluation.petshop.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.SupplierDto;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.service.SupplierService;

@RequestMapping("/suppliers")
@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
<<<<<<< HEAD

	@GetMapping
	public ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers() {
		return supplierService.getAllSuppliers();
	}
=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(@PathVariable int id) {
		return supplierService.getSupplierBySupplierId(id);
	}
}

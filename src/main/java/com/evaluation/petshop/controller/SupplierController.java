package com.evaluation.petshop.controller;
<<<<<<< HEAD

import java.util.List;

=======
import java.util.List;
import com.evaluation.petshop.models.dto.SupplierDto;
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.SupplierResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
<<<<<<< HEAD
import com.evaluation.petshop.models.dto.SupplierDto;
=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import com.evaluation.petshop.service.SupplierService;

@RequestMapping("/suppliers")
@RestController
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	@GetMapping
	public ResponseEntity<ResponseStructure<List<SupplierDto>>> getAllSuppliers() {
		return supplierService.getAllSuppliers();
	}
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<SupplierResponseDto>> getSupplierBySupplierId(@PathVariable int id) {
		return supplierService.getSupplierBySupplierId(id);
	}
}

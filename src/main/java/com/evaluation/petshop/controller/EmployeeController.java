package com.evaluation.petshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.EmployeeResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.EmployeeService;
@RequestMapping("/employees")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping()
	public ResponseEntity<ResponseStructure<List<EmployeeResponseDto>>> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}

package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.EmployeeResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface EmployeeService {
	ResponseEntity<ResponseStructure<List<EmployeeResponseDto>>> getAllEmployees();

}

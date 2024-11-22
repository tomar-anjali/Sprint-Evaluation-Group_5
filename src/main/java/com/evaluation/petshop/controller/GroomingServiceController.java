package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.GroomingServiceService;

@RequestMapping("/services")
@RestController
public class GroomingServiceController {
	@Autowired
	GroomingServiceService groomingServiceService;

	@GetMapping("/available")
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable() {
		return groomingServiceService.getAllGroomingServiceAvailable();

	}

}

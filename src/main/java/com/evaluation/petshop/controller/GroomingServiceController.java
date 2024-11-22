package com.evaluation.petshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.GroomingServiceService;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.GroomingServiceService;

@RequestMapping("/services")
@RestController
public class GroomingServiceController {
	@Autowired
	private GroomingServiceService groomingServiceService;

	@GetMapping("/available")
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable() {
		return groomingServiceService.getAllGroomingServiceAvailable();
	}

	@GetMapping()
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService() {
		return groomingServiceService.getAllGroomingService();
	}

	@GetMapping("/{serviceId}")
	public ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(
			@PathVariable int serviceId) {
		return groomingServiceService.getGroomingServiceById(serviceId);
	}

	@PutMapping("/update/{serviceId}")
	public ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(
			@PathVariable int serviceId, @RequestBody GroomingServiceResponseDto groomingServiceResponseDto) {
		return groomingServiceService.updateGroomingService(serviceId, groomingServiceResponseDto);
	}

	@PostMapping("/add")
	public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(
			@RequestBody GroomingServiceDto groomingServiceDto) {
		return groomingServiceService.addGroomingService(groomingServiceDto);
	}

}

package com.evaluation.petshop.service;

import java.util.List;
<<<<<<< HEAD

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface GroomingServiceService {
	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable();
=======
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface GroomingServiceService {
	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService();
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(int serviceId);

	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(int serviceId,
			GroomingServiceResponseDto groomingServiceResponseDto);

	public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(
			GroomingServiceDto groomingServiceDto);
}

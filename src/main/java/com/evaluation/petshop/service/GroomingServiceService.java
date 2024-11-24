package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface GroomingServiceService {
	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService();

	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(int serviceId);

	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable();

	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(int serviceId,
			GroomingServiceResponseDto groomingServiceResponseDto);

	public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(
			GroomingServiceDto groomingServiceDto);

}

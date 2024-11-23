package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface GroomingServiceService {
	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService();
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(int serviceId);
  ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable();
	ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(int serviceId,
			GroomingServiceResponseDto groomingServiceResponseDto);
	public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(
			GroomingServiceDto groomingServiceDto);

	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable();
}

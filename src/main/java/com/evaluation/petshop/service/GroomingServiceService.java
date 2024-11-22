package com.evaluation.petshop.service;

<<<<<<< HEAD
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.GroomingServiceDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

=======
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
public interface GroomingServiceService {
	 ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingService();

	  
	  ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> getGroomingServiceById(int serviceId);

	  ResponseEntity<ResponseStructure<GroomingServiceResponseDto>> updateGroomingService(int serviceId, GroomingServiceResponseDto groomingServiceResponseDto);

	  public ResponseEntity<ResponseStructure<GroomingServiceDto>> addGroomingService(GroomingServiceDto groomingServiceDto);
}

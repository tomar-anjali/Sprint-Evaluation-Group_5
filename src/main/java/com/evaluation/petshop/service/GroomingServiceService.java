package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface GroomingServiceService {
	ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable();

}

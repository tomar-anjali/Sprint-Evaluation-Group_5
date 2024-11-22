package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetService {
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getAllPets();

}

package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodId(int foodId);

	ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood();
}

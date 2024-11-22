package com.evaluation.petshop.service;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(String foodName);

}

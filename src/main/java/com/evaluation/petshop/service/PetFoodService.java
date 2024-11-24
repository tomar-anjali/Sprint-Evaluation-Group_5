package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(String foodName);
	ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodId(int foodId);
	ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood();
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getPetFoodByName(String name);
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> savePetFood(PetFoodDto petFoodDto) ;
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> updatePetFood(int foodId, PetFoodDto petFoodDto) ;
}

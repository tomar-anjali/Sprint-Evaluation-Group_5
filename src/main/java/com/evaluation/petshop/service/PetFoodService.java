package com.evaluation.petshop.service;

import java.util.List;
<<<<<<< HEAD

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodId(int foodId);

=======
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
	ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood();
}

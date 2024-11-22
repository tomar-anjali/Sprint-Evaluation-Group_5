package com.evaluation.petshop.service;

<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(String foodName);

=======
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
public interface PetFoodService {
	ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodId(int foodId);
	ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood();
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
}

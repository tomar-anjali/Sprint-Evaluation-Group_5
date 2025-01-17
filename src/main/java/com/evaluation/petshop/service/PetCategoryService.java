package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.dto.PetCategoryDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetCategoryService {
	ResponseEntity<ResponseStructure<List<PetCategoryResponseDto>>> getAllPetCategories();

	ResponseEntity<ResponseStructure<PetCategoryResponseDto>> getPetCategoryById(int addressId);

	ResponseEntity<ResponseStructure<PetCategoryResponseDto>> updatePetCategory(int petCategoryId,
			PetCategoryResponseDto petCategorydto);

	ResponseEntity<ResponseStructure<PetCategoryDto>> savePetCategory(PetCategoryDto petCategoryDto);

	ResponseEntity<ResponseStructure<List<PetCategoryResponseDto>>> getPetCategoryByName(String name);
}

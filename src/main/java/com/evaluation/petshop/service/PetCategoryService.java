package com.evaluation.petshop.service;

<<<<<<< HEAD


public interface PetCategoryService {



=======
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
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

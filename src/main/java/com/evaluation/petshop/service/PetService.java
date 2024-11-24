package com.evaluation.petshop.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.PetDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetService {
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getAllPets();
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(int category);
	ResponseEntity<ResponseStructure<PetResponseDto>> getPetById(int petId);
	ResponseEntity<ResponseStructure<PetResponseDto>> updatePet(int petId, PetDto petRequestDto);
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByName(String name);
	ResponseEntity<ResponseStructure<PetResponseDto>> addPet(PetDto petRequestDto);

}

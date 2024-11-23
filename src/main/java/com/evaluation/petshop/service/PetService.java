package com.evaluation.petshop.service;

import java.util.List;
<<<<<<< HEAD

import org.springframework.http.ResponseEntity;

=======
import org.springframework.http.ResponseEntity;
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
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

package com.evaluation.petshop.service;

import java.util.List;
<<<<<<< HEAD

import org.springframework.http.ResponseEntity;

=======
import org.springframework.http.ResponseEntity;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetService {
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getAllPets();

	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(int category);
}

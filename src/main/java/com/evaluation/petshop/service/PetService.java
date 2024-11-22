package com.evaluation.petshop.service;

<<<<<<< HEAD


public interface PetService {


	

=======
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface PetService {
	ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(int category);
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetService;

@RequestMapping("/pets")
@RestController
public class PetController {
<<<<<<< HEAD
	@Autowired
	private PetService petService;

	@GetMapping
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getAllPets() {
		return petService.getAllPets();
	}

=======

	@Autowired
	PetService petService;

	@GetMapping("/{category}")
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(@PathVariable int category) {
		return petService.getPetByCategory(category);
	}
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
}

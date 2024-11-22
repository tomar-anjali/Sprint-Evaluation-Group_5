package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
=======

import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.dto.PetCategoryDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetCategoryService;

>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
@RequestMapping("/categories")
@RestController
public class PetCategoryController {
	@Autowired
	private PetCategoryService petCategoryService;

<<<<<<< HEAD
	
=======
	@GetMapping
	public ResponseEntity<ResponseStructure<List<PetCategoryResponseDto>>> getAllPetCategories() {
		return petCategoryService.getAllPetCategories();
	}

	@GetMapping("/{petCategoryId}")
	public ResponseEntity<ResponseStructure<PetCategoryResponseDto>> getAddressById(@PathVariable int petCategoryId) {
		return petCategoryService.getPetCategoryById(petCategoryId);
	}

	@PutMapping("/{petCategoryId}")
	public ResponseEntity<ResponseStructure<PetCategoryResponseDto>> updateHospital(@PathVariable int petCategoryId,
			@RequestBody PetCategoryResponseDto petCategorydto) {
		return petCategoryService.updatePetCategory(petCategoryId, petCategorydto);
	}

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<PetCategoryDto>> savePetCategory(
			@RequestBody PetCategoryDto petCategoryDto) {
		return petCategoryService.savePetCategory(petCategoryDto);
	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

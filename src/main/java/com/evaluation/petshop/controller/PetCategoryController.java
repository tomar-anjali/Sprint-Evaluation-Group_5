package com.evaluation.petshop.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.dto.PetCategoryDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.PetCategory;
import com.evaluation.petshop.service.PetCategoryService;

@RequestMapping("/categories")
@RestController
public class PetCategoryController {
	@Autowired
	private PetCategoryService petCategoryService;

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

	@GetMapping("/name/{name}")
	public ResponseEntity<ResponseStructure<List<PetCategoryResponseDto>>> getPetCategoryByName(
			@PathVariable String name) {
		return petCategoryService.getPetCategoryByName(name);
	}

}

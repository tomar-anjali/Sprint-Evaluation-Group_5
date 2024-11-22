package com.evaluation.petshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
=======
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetFoodService;

@RequestMapping("/pet_foods")
@RestController
public class PetFoodController {
	@Autowired
	private PetFoodService petFoodService;
<<<<<<< HEAD

	@GetMapping
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood() {
		return petFoodService.getAllPetFood();
	}

	@GetMapping("/{foodId}")
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodid(@PathVariable int foodId) {
		return petFoodService.getPetFoodByFoodId(foodId);
	}
=======
	@GetMapping()
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood(){
		return petFoodService.getAllPetFood();
	}
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
}

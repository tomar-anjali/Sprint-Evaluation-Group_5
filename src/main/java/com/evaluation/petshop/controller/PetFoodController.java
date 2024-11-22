package com.evaluation.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetFoodService;
import com.evaluation.petshop.models.dto.PetFoodDto;

@RequestMapping("/pet_foods")
@RestController
public class PetFoodController {
	@Autowired
	private PetFoodService petFoodService;

	@GetMapping("/search")
	public ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(@RequestParam("name") String name) {
		return petFoodService.getPetFoodByFoodName(name);
	}

	@GetMapping
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood() {
		return petFoodService.getAllPetFood();
	}

	@GetMapping("/{foodId}")
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodid(@PathVariable int foodId) {
		return petFoodService.getPetFoodByFoodId(foodId);
	}
}

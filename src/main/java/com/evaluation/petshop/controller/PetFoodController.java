package com.evaluation.petshop.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
=======
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetFoodService;

import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetFoodService;

@RequestMapping("/pet_foods")
@RestController
public class PetFoodController {
	@Autowired
	private PetFoodService petFoodService;
<<<<<<< HEAD
	
	@GetMapping("/search")
	public ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(@RequestParam("name") String name) {
	    return petFoodService.getPetFoodByFoodName(name);
	}
=======
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

	@GetMapping
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood() {
		return petFoodService.getAllPetFood();
	}

	@GetMapping("/{foodId}")
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodid(@PathVariable int foodId) {
		return petFoodService.getPetFoodByFoodId(foodId);
	}
}

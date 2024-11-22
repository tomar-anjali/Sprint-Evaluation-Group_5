package com.evaluation.petshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.PetFoodService;

@RequestMapping("/pet_foods")
@RestController
public class PetFoodController {
	@Autowired
	private PetFoodService petFoodService;
	
	@GetMapping("/search")
	public ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(@RequestParam("name") String name) {
	    return petFoodService.getPetFoodByFoodName(name);
	}

}

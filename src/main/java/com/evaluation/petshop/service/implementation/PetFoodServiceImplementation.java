package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.PetFoodDao;
import com.evaluation.petshop.models.ResponseDto.PetFoodResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.service.PetFoodService;

@Service
public class PetFoodServiceImplementation implements PetFoodService {
	@Autowired
	private PetFoodDao petFoodDao;

<<<<<<< HEAD
	@Autowired
	private PetFoodDao petFoodDao;

	@Override
	public ResponseEntity<ResponseStructure<PetFoodResponseDto>> getPetFoodByFoodId(int foodId) {
		PetFood petFood = petFoodDao.getPetFoodByFoodId(foodId);
		PetFoodResponseDto petFoodResponseDto = new PetFoodResponseDto();
		petFoodResponseDto.setFoodId(petFood.getFoodId());
		petFoodResponseDto.setBrand(petFood.getBrand());
		petFoodResponseDto.setName(petFood.getName());
		petFoodResponseDto.setPrice(petFood.getPrice());
		petFoodResponseDto.setQuantity(petFood.getQuantity());
		petFoodResponseDto.setType(petFood.getType());

		ResponseStructure<PetFoodResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(petFoodResponseDto);

		return new ResponseEntity<>(response, HttpStatus.FOUND);
	}
	
	@Override
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood() {
		List<PetFood> petFood = petFoodDao.getAllPetFood();
	
			// Map PetFood entities to DTOs
			List<PetFoodResponseDto> petFoodResponseDtos = petFood.stream().map(petFoods -> {
			
				
				PetFoodResponseDto petFoodResponsedto = new PetFoodResponseDto();
				petFoodResponsedto.setFoodId(petFoods.getFoodId());
				petFoodResponsedto.setBrand(petFoods.getBrand());
				petFoodResponsedto.setName(petFoods.getName());
				petFoodResponsedto.setPrice(petFoods.getPrice());
				petFoodResponsedto.setQuantity(petFoods.getQuantity());
				petFoodResponsedto.setType(petFoods.getType());
				return petFoodResponsedto;
			}).collect(Collectors.toList());

			ResponseStructure<List<PetFoodResponseDto>> response = new ResponseStructure<>();
			response.setStatusCode(HttpStatus.FOUND.value());
			response.setMessage("Success");
			response.setData(petFoodResponseDtos);

			return new ResponseEntity<>(response, HttpStatus.FOUND);

=======
	@Override
	public ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>> getAllPetFood() {
		List<PetFood> foods=petFoodDao.getAllPetFood();
		
		List<PetFoodResponseDto> petFoodResponseDtos=foods.stream().map(data->{
			PetFoodResponseDto dto=new PetFoodResponseDto();
			dto.setName(data.getName());
			dto.setBrand(data.getBrand());
			dto.setPrice(data.getPrice());
			dto.setQuantity(data.getQuantity());
			dto.setType(data.getType());
			return dto;
		}).collect(Collectors.toList());
		
		ResponseStructure<List<PetFoodResponseDto>> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(petFoodResponseDtos);
		return new ResponseEntity<ResponseStructure<List<PetFoodResponseDto>>>(responseStructure, HttpStatus.FOUND);
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
	}
}

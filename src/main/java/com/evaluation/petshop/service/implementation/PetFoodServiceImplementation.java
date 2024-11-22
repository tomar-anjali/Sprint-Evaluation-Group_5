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
	}
}

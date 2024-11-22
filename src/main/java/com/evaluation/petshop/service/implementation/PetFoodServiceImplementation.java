package com.evaluation.petshop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.dto.PetFoodDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.repository.PetFoodRepository;
import com.evaluation.petshop.service.PetFoodService;

@Service
public class PetFoodServiceImplementation implements PetFoodService {
	@Autowired
    private PetFoodRepository petFoodRepository;
    @Override
    public ResponseEntity<ResponseStructure<PetFoodDto>> getPetFoodByFoodName(String foodName) {
        PetFood petFood = petFoodRepository.findByFoodName(foodName)
                .orElseThrow(() -> new DataNotFoundException("Validation failed"));

        PetFoodDto dto = new PetFoodDto();
        dto.setName(petFood.getName());
        dto.setPrice(petFood.getPrice());
        dto.setBrand(petFood.getBrand());
        dto.setQuantity(petFood.getQuantity());
        dto.setType(petFood.getType());
        // Map other fields

        ResponseStructure<PetFoodDto> response = new ResponseStructure<>();
        response.setData(dto);
        response.setMessage("Pet food fetched successfully");
        response.setStatusCode(HttpStatus.OK.value());

        return ResponseEntity.ok(response);
    }

}

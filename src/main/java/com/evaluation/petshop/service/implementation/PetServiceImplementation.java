package com.evaluation.petshop.service.implementation;

<<<<<<< HEAD

=======
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.PetDao;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Pet;
import com.evaluation.petshop.service.PetService;

@Service
public class PetServiceImplementation implements PetService{
<<<<<<< HEAD

	


=======
	@Autowired
	PetDao petDao;
	
	@Override
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(int category) {
		List<Pet> pets=petDao.getPetByCategory(category);
		
		List<PetResponseDto> petResponseDto=pets.stream().map(data->{
			
			PetCategoryResponseDto petCategoryResponseDto=new PetCategoryResponseDto();
			if(data.getPetCategory()!=null) {
				petCategoryResponseDto.setName(data.getPetCategory().getName());
			}
			PetResponseDto dtos=new PetResponseDto();
			dtos.setName(data.getName());
			dtos.setAge(data.getAge());
			dtos.setPetCategory(petCategoryResponseDto);
			dtos.setBreed(data.getBreed());
			dtos.setDescription(data.getDescription());
			dtos.setPrice(data.getPrice());
			dtos.setImageUrl(data.getImageUrl());
			return dtos;
		}).collect(Collectors.toList());
		
		ResponseStructure<List<PetResponseDto>> responseStructure=new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData( petResponseDto);
		
		return new ResponseEntity<ResponseStructure<List<PetResponseDto>>>(responseStructure,HttpStatus.FOUND);
	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

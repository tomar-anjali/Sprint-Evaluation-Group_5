package com.evaluation.petshop.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.PetCategoryDao;
import com.evaluation.petshop.dao.PetDao;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.dto.PetDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Pet;
import com.evaluation.petshop.models.entity.PetCategory;
import com.evaluation.petshop.service.PetService;

@Service
public class PetServiceImplementation implements PetService {

	@Autowired
	private PetDao petDao;
	@Autowired
	private PetCategoryDao petCategoryDao;

	@Override
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getAllPets() {
		List<Pet> pets = petDao.getAllPets();
		List<PetResponseDto> petResponsedtos = pets.stream().map(data -> {
			PetCategoryResponseDto petCategoryResponseDto = new PetCategoryResponseDto();
			if (data.getPetCategory() != null) {
				petCategoryResponseDto.setCategoryId(data.getPetCategory().getCategoryId());
				petCategoryResponseDto.setName(data.getPetCategory().getName());
			}
			PetResponseDto petResponseDto = new PetResponseDto();
			petResponseDto.setName(data.getName());
			petResponseDto.setPetId(data.getPetId());
			petResponseDto.setAge(data.getAge());
			petResponseDto.setBreed(data.getBreed());
			petResponseDto.setPrice(data.getPrice());
			petResponseDto.setDescription(data.getDescription());
			petResponseDto.setImageUrl(data.getImageUrl());
			petResponseDto.setPetCategory(petCategoryResponseDto);
			return petResponseDto;
		}).collect(Collectors.toList());
		ResponseStructure<List<PetResponseDto>> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage("Success");
		response.setData(petResponsedtos);
		return new ResponseEntity<ResponseStructure<List<PetResponseDto>>>(response, HttpStatus.FOUND);
	}
	@Override
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByCategory(int category) {
		List<Pet> pets = petDao.getPetByCategory(category);

		List<PetResponseDto> petResponseDto = pets.stream().map(data -> {

			PetCategoryResponseDto petCategoryResponseDto = new PetCategoryResponseDto();
			if (data.getPetCategory() != null) {
				petCategoryResponseDto.setName(data.getPetCategory().getName());
			}
			PetResponseDto dtos = new PetResponseDto();
			dtos.setName(data.getName());
			dtos.setAge(data.getAge());
			dtos.setPetCategory(petCategoryResponseDto);
			dtos.setBreed(data.getBreed());
			dtos.setDescription(data.getDescription());
			dtos.setPrice(data.getPrice());
			dtos.setImageUrl(data.getImageUrl());
			return dtos;
		}).collect(Collectors.toList());

		ResponseStructure<List<PetResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(petResponseDto);
		return new ResponseEntity<ResponseStructure<List<PetResponseDto>>>(responseStructure, HttpStatus.FOUND);
	}
	
	@Override
	public ResponseEntity<ResponseStructure<PetResponseDto>> getPetById(int petId) {
		Pet pet =petDao.getPetById(petId);
		PetCategoryResponseDto petCategoryResponsedto=new PetCategoryResponseDto();		
		if(pet.getPetCategory()!=null)
		{
			petCategoryResponsedto.setCategoryId(pet.getPetCategory().getCategoryId());
			petCategoryResponsedto.setName(pet.getPetCategory().getName());
		}
		PetResponseDto petResponsedto=new PetResponseDto();
		petResponsedto.setPetId(pet.getPetId());
		petResponsedto.setName(pet.getName());
		petResponsedto.setAge(pet.getAge());
		petResponsedto.setBreed(pet.getBreed());
		petResponsedto.setPrice(pet.getPrice());
		petResponsedto.setDescription(pet.getDescription());
		petResponsedto.setImageUrl(pet.getImageUrl());
		petResponsedto.setPetCategory(petCategoryResponsedto);
		
		
		ResponseStructure<PetResponseDto> response= new ResponseStructure<>();
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage("Success");
		response.setData(petResponsedto);
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<PetResponseDto>> updatePet(int petId, PetDto petRequestDto) {
	    // Convert PetDto to Pet entity for updating
	    Pet petToUpdate = new Pet();
	    petToUpdate.setPetId(petId);
	    petToUpdate.setName(petRequestDto.getName());
	    petToUpdate.setAge(petRequestDto.getAge());
	    petToUpdate.setBreed(petRequestDto.getBreed());
	    petToUpdate.setPrice(petRequestDto.getPrice());
	    petToUpdate.setDescription(petRequestDto.getDescription());
	    petToUpdate.setImageUrl(petRequestDto.getImageUrl());

	    if (petRequestDto.getPetCategoryId() > 0) {
	        PetCategory petCategory = new PetCategory();
	        petCategory.setCategoryId(petRequestDto.getPetCategoryId()); // Set category ID
	        petToUpdate.setPetCategory(petCategory);
	    }

	    // Fetch existing pet and update its fields
	    Pet updatedPet = petDao.updatePet(petId, petToUpdate);

	    // Prepare the response DTO to send back to the client
	    PetResponseDto updatedPetResponsedto = new PetResponseDto();
	    updatedPetResponsedto.setPetId(updatedPet.getPetId());
	    updatedPetResponsedto.setName(updatedPet.getName());
	    updatedPetResponsedto.setAge(updatedPet.getAge());
	    updatedPetResponsedto.setBreed(updatedPet.getBreed());
	    updatedPetResponsedto.setPrice(updatedPet.getPrice());
	    updatedPetResponsedto.setDescription(updatedPet.getDescription());
	    updatedPetResponsedto.setImageUrl(updatedPet.getImageUrl());

	    PetCategoryResponseDto petCategoryResponsedto = new PetCategoryResponseDto();
	    if (updatedPet.getPetCategory() != null) {
	        petCategoryResponsedto.setCategoryId(updatedPet.getPetCategory().getCategoryId());
	        petCategoryResponsedto.setName(updatedPet.getPetCategory().getName());
	    }
	    updatedPetResponsedto.setPetCategory(petCategoryResponsedto);

	    ResponseStructure<PetResponseDto> response = new ResponseStructure<>();
	    response.setStatusCode(HttpStatus.OK.value());
	    response.setMessage("Pet updated successfully");
	    response.setData(updatedPetResponsedto);
	    return new ResponseEntity<>(response, HttpStatus.OK);
	}


	@Override
	public ResponseEntity<ResponseStructure<PetResponseDto>> addPet(PetDto petRequestDto) {
	    Pet newPet = new Pet();
	    newPet.setName(petRequestDto.getName());
	    newPet.setAge(petRequestDto.getAge());
	    newPet.setBreed(petRequestDto.getBreed());
	    newPet.setPrice(petRequestDto.getPrice());
	    newPet.setDescription(petRequestDto.getDescription());
	    newPet.setImageUrl(petRequestDto.getImageUrl());

//	    if (petRequestDto.getPetCategoryId() > 0) {
//	        PetCategory petCategory = new PetCategory();
//	        petCategory.setCategoryId(petRequestDto.getPetCategoryId());
//	        newPet.setPetCategory(petCategory);
//	    }
	    
	    PetCategory petCategory = petCategoryDao.petCategoryById(petRequestDto.getPetCategoryId());
	    newPet.setPetCategory(petCategory);
	    
	    Pet savedPet = petDao.addNewPet(newPet);

	    PetResponseDto petResponsedto = new PetResponseDto();
	    petResponsedto.setPetId(savedPet.getPetId());
	    petResponsedto.setName(savedPet.getName());
	    petResponsedto.setAge(savedPet.getAge());
	    petResponsedto.setBreed(savedPet.getBreed());
	    petResponsedto.setPrice(savedPet.getPrice());
	    petResponsedto.setDescription(savedPet.getDescription());
	    petResponsedto.setImageUrl(savedPet.getImageUrl());

	    PetCategoryResponseDto petCategoryResponsedto = new PetCategoryResponseDto();
	    if (savedPet.getPetCategory() != null) {
	        petCategoryResponsedto.setCategoryId(savedPet.getPetCategory().getCategoryId());
	        petCategoryResponsedto.setName(savedPet.getPetCategory().getName());
	    }
	    petResponsedto.setPetCategory(petCategoryResponsedto);

	    ResponseStructure<PetResponseDto> response = new ResponseStructure<>();
	    response.setStatusCode(HttpStatus.CREATED.value());
	    response.setMessage("Pet added successfully");
	    response.setData(petResponsedto);
	    return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<PetResponseDto>>> getPetByName(String name) {
	    List<Pet> pet = petDao.getPetByName(name);

	    PetCategoryResponseDto petCategoryResponsedto = new PetCategoryResponseDto();
	    
	    for(Pet pets : pet) {
	    	if (pets.getPetCategory() != null) {
		        petCategoryResponsedto.setCategoryId(pets.getPetCategory().getCategoryId());
		        petCategoryResponsedto.setName(pets.getPetCategory().getName());
		    }
	    }
	    List<PetResponseDto> al = new ArrayList<>();
	    for(Pet pets : pet) {
	    	PetResponseDto petResponsedto = new PetResponseDto();
		    petResponsedto.setPetId(pets.getPetId());
		    petResponsedto.setName(pets.getName());
		    petResponsedto.setAge(pets.getAge());
		    petResponsedto.setBreed(pets.getBreed());
		    petResponsedto.setPrice(pets.getPrice());
		    petResponsedto.setDescription(pets.getDescription());
		    petResponsedto.setImageUrl(pets.getImageUrl());
		    petResponsedto.setPetCategory(petCategoryResponsedto);
		    al.add(petResponsedto);
	    }
	    

	    ResponseStructure<List<PetResponseDto>> response = new ResponseStructure<>();
	    response.setStatusCode(HttpStatus.OK.value());
	    response.setMessage("Success");
	    response.setData(al);

	    return new ResponseEntity<ResponseStructure<List<PetResponseDto>>>(response, HttpStatus.OK);
	}

}

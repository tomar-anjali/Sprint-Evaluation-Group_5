package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.evaluation.petshop.dao.PetCategoryDao;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.dto.PetCategoryDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.PetCategory;
import com.evaluation.petshop.service.PetCategoryService;

@Service
public class PetCategoryServiceImplementation implements PetCategoryService {
	@Autowired
	private PetCategoryDao petCategoryDao;

	@Override
	public ResponseEntity<ResponseStructure<List<PetCategoryResponseDto>>> getAllPetCategories() {
		List<PetCategory> petCategories = petCategoryDao.getAllPetCategories();

		List<PetCategoryResponseDto> petCategoryResponseDtos = petCategories.stream().map(petCategory -> {
			PetCategoryResponseDto petCategoryResponseDto = new PetCategoryResponseDto();
			petCategoryResponseDto.setCategoryId(petCategory.getCategoryId());
			petCategoryResponseDto.setName(petCategory.getName());
			return petCategoryResponseDto;
		}).collect(Collectors.toList());

		ResponseStructure<List<PetCategoryResponseDto>> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(petCategoryResponseDtos);

		return new ResponseEntity<>(response, HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<PetCategoryDto>> savePetCategory(PetCategoryDto petCategoryDto) {
		// Convert DTO to Entity
		PetCategory petCategory = new PetCategory();
		petCategory.setName(petCategoryDto.getName());

		// Save the category
		PetCategory savedPetCategory = petCategoryDao.savePetCategory(petCategory);

		// Convert the saved entity back to DTO
		PetCategoryDto savedPetCategoryDto = new PetCategoryDto();
		savedPetCategoryDto.setName(savedPetCategory.getName());

		// Prepare the response structure
		ResponseStructure<PetCategoryDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.CREATED.value());
		response.setMessage("Pet Category created successfully");
		response.setData(savedPetCategoryDto);

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<PetCategoryResponseDto>> getPetCategoryById(int addressId) {
		PetCategory petCategory = petCategoryDao.petCategoryById(addressId);
		PetCategoryResponseDto ca = new PetCategoryResponseDto();
		ca.setCategoryId(petCategory.getCategoryId());
		ca.setName(petCategory.getName());

		ResponseStructure<PetCategoryResponseDto> response = new ResponseStructure<>();
		response.setMessage("Success");
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setData(ca);

		return new ResponseEntity<ResponseStructure<PetCategoryResponseDto>>(response, HttpStatus.FOUND);

	}

	@Override
	public ResponseEntity<ResponseStructure<PetCategoryResponseDto>> updatePetCategory(int petId,
			PetCategoryResponseDto petResponsedto) {
		// Convert PetResponsedto to Pet entity for updating
		PetCategory petToUpdate = new PetCategory();
		petToUpdate.setCategoryId(petId);
		petToUpdate.setName(petResponsedto.getName());

		PetCategory updatedPet = petCategoryDao.updatePetCategory(petId, petToUpdate);

		// Prepare the response DTO to send back to the client
		PetCategoryResponseDto updatedPetResponsedto = new PetCategoryResponseDto();
		updatedPetResponsedto.setCategoryId(updatedPet.getCategoryId());
		updatedPetResponsedto.setName(updatedPet.getName());

		ResponseStructure<PetCategoryResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.OK.value());
		response.setMessage("Pet updated successfully");
		response.setData(updatedPetResponsedto);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

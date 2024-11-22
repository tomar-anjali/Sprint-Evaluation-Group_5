package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
=======
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895

import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.PetCategoryDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.PetCategory;
import com.evaluation.petshop.repository.PetCategoryRepository;

<<<<<<< HEAD

	

=======
@Repository
public class PetCategoryDaoImplementation implements PetCategoryDao {

	@Autowired
	private PetCategoryRepository petCategoryRepository;

	@Override
	public List<PetCategory> getAllPetCategories() {
		List<PetCategory> petCategories = petCategoryRepository.findAll();
		if (!petCategories.isEmpty())
			return petCategories;
		else
			throw new DataNotFoundException("Validation Failed");
	}


	@Override
	public PetCategory  petCategoryById(int addressId) {
		Optional<PetCategory> address = petCategoryRepository.findById(addressId);
		if (address.isPresent())
			return address.get();
		else
			throw new DataNotFoundException("Validation failed");

	}
	
	@Override
	public PetCategory updatePetCategory(int petId, PetCategory updatedPet) {
		Optional<PetCategory> petOptional = petCategoryRepository.findById(petId);
		if (petOptional.isPresent()) {
			PetCategory pet = petOptional.get();
			// Update fields of the existing pet object with the new data
			pet.setName(updatedPet.getName());

			return petCategoryRepository.save(pet); // Save the updated pet back to the database
		} else {
			throw new DataNotFoundException("Pet not found for update");
		}
	}

	@Override
	public PetCategory savePetCategory(PetCategory petCategory) {
		return petCategoryRepository.save(petCategory);
	}
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

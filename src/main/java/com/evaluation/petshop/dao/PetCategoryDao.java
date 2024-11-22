package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.PetCategory;

public interface PetCategoryDao {
	List<PetCategory> getAllPetCategories();

	PetCategory updatePetCategory(int petId, PetCategory updatedPet);

	PetCategory petCategoryById(int petCategoryId);

	PetCategory savePetCategory(PetCategory petCategory);
}

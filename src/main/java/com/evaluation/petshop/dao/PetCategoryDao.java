package com.evaluation.petshop.dao;

<<<<<<< HEAD

public interface PetCategoryDao {
=======
import java.util.List;
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895

import com.evaluation.petshop.models.entity.PetCategory;

public interface PetCategoryDao {
	List<PetCategory> getAllPetCategories();

	PetCategory updatePetCategory(int petId, PetCategory updatedPet);

	PetCategory petCategoryById(int petCategoryId);

	PetCategory savePetCategory(PetCategory petCategory);
}

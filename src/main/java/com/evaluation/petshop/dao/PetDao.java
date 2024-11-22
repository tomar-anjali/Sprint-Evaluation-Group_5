package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.Pet;

public interface PetDao {
	List<Pet> getAllPets();

	List<Pet> getPetByCategory(int category);
}

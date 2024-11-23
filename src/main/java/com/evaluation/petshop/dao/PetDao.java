package com.evaluation.petshop.dao;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import com.evaluation.petshop.models.entity.Pet;

public interface PetDao {
	List<Pet> getAllPets();
	List<Pet> getPetByCategory(int category);
	Pet getPetById(int petId);
	Pet updatePet(int petId, Pet pet);
	Pet addNewPet(Pet pet);
	List<Pet> getPetByName(String name);
}

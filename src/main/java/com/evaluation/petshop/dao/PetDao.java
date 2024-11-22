package com.evaluation.petshop.dao;

import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.Pet;

public interface PetDao {
	List<Pet> getAllPets();

	List<Pet> getPetByCategory(int category);
}

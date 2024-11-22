package com.evaluation.petshop.dao;

<<<<<<< HEAD

public interface PetDao {



=======
import java.util.List;
import com.evaluation.petshop.models.entity.Pet;

public interface PetDao {
	List<Pet> getPetByCategory(int category);
>>>>>>> f479527e70758d1e07580cedb64cdd81f24dd895
}

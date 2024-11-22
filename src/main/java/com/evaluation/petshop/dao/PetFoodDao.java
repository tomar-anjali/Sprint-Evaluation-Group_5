package com.evaluation.petshop.dao;

<<<<<<< HEAD
import com.evaluation.petshop.models.entity.PetFood;

public interface PetFoodDao {
	PetFood getPetFoodByFoodName(String name);

=======
import java.util.List;
import com.evaluation.petshop.models.entity.PetFood;
public interface PetFoodDao {
	PetFood getPetFoodByFoodId(int foodId);
	List<PetFood> getAllPetFood();
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
}

package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.PetFood;
import java.util.List;
public interface PetFoodDao {
	PetFood getPetFoodByFoodName(String name);
	PetFood getPetFoodByFoodId(int foodId);

	List<PetFood> getAllPetFood();
}

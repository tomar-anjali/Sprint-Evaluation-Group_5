package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.PetFood;
public interface PetFoodDao {
	PetFood getPetFoodByFoodId(int foodId);
	List<PetFood> getAllPetFood();
	public List<PetFood> getPetFoodByName(String name) ;
	public PetFood updatePetFood(PetFood petFood);
	public PetFood savePetFood(PetFood petFood);
}

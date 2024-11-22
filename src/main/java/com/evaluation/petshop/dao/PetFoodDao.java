package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.PetFood;

public interface PetFoodDao {
	PetFood getPetFoodByFoodName(String name);

}

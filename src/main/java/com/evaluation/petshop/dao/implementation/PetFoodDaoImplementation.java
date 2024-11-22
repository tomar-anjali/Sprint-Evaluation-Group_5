package com.evaluation.petshop.dao.implementation;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.PetFoodDao;
<<<<<<< HEAD
import com.evaluation.petshop.exception.DataNotFoundException;
=======
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.repository.PetFoodRepository;

@Repository
public class PetFoodDaoImplementation implements PetFoodDao {
	@Autowired
<<<<<<< HEAD
	private PetFoodRepository petFoodRepository;

	@Override
	public PetFood getPetFoodByFoodId(int foodId) {
		Optional<PetFood> optionalPetFood = petFoodRepository.findById(foodId);
		if (optionalPetFood.isPresent())
			return optionalPetFood.get();
		else
			throw new DataNotFoundException("Validation failed");

	}
	
	@Override
	public List<PetFood> getAllPetFood() {
		return petFoodRepository.findAll();
=======
	private PetFoodRepository foodRepository;

	@Override
	public List<PetFood> getAllPetFood() {
		return foodRepository.findAll();
>>>>>>> 416241c594739576fb695a8abe640a5f912890a8
	}
}

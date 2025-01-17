package com.evaluation.petshop.dao.implementation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.evaluation.petshop.dao.PetFoodDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.repository.PetFoodRepository;

@Repository
public class PetFoodDaoImplementation implements PetFoodDao{
	@Autowired
    private PetFoodRepository petFoodRepository;
    @Override
    public PetFood getPetFoodByFoodName(String name){
    	Optional<PetFood> optionalPetFood = petFoodRepository.findByFoodName(name);
    	return optionalPetFood
    			.orElseThrow(() -> new DataNotFoundException("Validation failed"));
    }
	@Override
	public List<PetFood> getPetFoodByName(String name) {
		return petFoodRepository.findByName(name);
	}

	// Save Pet Food
	@Override
	public PetFood savePetFood(PetFood petFood) {
		return petFoodRepository.save(petFood);
	}

	// Update Pet Food
	@Override
	public PetFood updatePetFood(PetFood petFood) {
		return petFoodRepository.save(petFood);
	}

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
	}
}

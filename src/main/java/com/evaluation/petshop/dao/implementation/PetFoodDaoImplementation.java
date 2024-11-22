package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
=======
import java.util.List;
import java.util.Optional;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.PetFoodDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.repository.PetFoodRepository;

@Repository
<<<<<<< HEAD
public class PetFoodDaoImplementation implements PetFoodDao{
	@Autowired
    private PetFoodRepository petFoodRepository;
    @Override
    public PetFood getPetFoodByFoodName(String name){
    	Optional<PetFood> optionalPetFood = petFoodRepository.findByFoodName(name);
    	return optionalPetFood
    			.orElseThrow(() -> new DataNotFoundException("Validation failed"));
       
    }
=======
public class PetFoodDaoImplementation implements PetFoodDao {
	@Autowired
	private PetFoodRepository petFoodRepository;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

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

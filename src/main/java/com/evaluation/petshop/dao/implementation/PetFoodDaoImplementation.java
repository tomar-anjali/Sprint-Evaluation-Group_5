package com.evaluation.petshop.dao.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

}

package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.PetFoodDao;
import com.evaluation.petshop.models.entity.PetFood;
import com.evaluation.petshop.repository.PetFoodRepository;

@Repository
public class PetFoodDaoImplementation implements PetFoodDao {
	@Autowired
	private PetFoodRepository foodRepository;

	@Override
	public List<PetFood> getAllPetFood() {
		return foodRepository.findAll();
	}
}

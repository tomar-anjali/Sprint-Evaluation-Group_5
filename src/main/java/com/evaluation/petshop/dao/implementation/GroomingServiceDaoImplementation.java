package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.GroomingServiceDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.GroomingService;
import com.evaluation.petshop.repository.GroomingServiceRepository;
@Repository
public class GroomingServiceDaoImplementation implements GroomingServiceDao{
	@Autowired
	GroomingServiceRepository groomingServiceRepository;

	@Override
	public List<GroomingService> getAllGroomingServicesAvailable() {
		List<GroomingService> groomingServices=groomingServiceRepository.findAllAvailableServices();
		if(!groomingServices.isEmpty())return groomingServices;
		else throw new DataNotFoundException("Validation Failed");
	}

}

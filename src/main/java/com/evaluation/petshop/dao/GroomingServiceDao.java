package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.GroomingService;

public interface GroomingServiceDao {
	List<GroomingService> getAllGroomingService();

	GroomingService getGroomingServiceById(int serviceId);

	public GroomingService updateGroomingService(int serviceId, GroomingService groomingService);

	public GroomingService addGroomingService(GroomingService groomingService);

}

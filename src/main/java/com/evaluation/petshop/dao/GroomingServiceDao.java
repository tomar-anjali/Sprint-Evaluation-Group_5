package com.evaluation.petshop.dao;

import java.util.List;
import com.evaluation.petshop.models.entity.GroomingService;

public interface GroomingServiceDao {
	List<GroomingService> getAllGroomingServicesAvailable();
	List<GroomingService> getAllGroomingService();
	GroomingService getGroomingServiceById(int serviceId);
	GroomingService updateGroomingService(int serviceId, GroomingService groomingService);
	GroomingService addGroomingService(GroomingService groomingService);

}

package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.GroomingServiceDao;
import com.evaluation.petshop.models.ResponseDto.GroomingServiceResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.GroomingService;
import com.evaluation.petshop.service.GroomingServiceService;

@Service
public class GroomingServiceServiceImplementation implements GroomingServiceService {
	@Autowired
	private GroomingServiceDao groomingServiceDao;

	@Override
	public ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>> getAllGroomingServiceAvailable() {
		List<GroomingService> groomingServices = groomingServiceDao.getAllGroomingServicesAvailable();
		List<GroomingServiceResponseDto> groomingServiceResponsedtos = groomingServices.stream()
				.filter(i -> i.isAvailable()).map(data -> {
					GroomingServiceResponseDto gro = new GroomingServiceResponseDto();
					gro.setAvailable(data.isAvailable());
					gro.setDescription(data.getDescription());
					gro.setName(data.getName());
					gro.setServiceId(data.getServiceId());
					gro.setPrice(data.getPrice());
					return gro;
				}).collect(Collectors.toList());
		ResponseStructure<List<GroomingServiceResponseDto>> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(groomingServiceResponsedtos);
		return new ResponseEntity<ResponseStructure<List<GroomingServiceResponseDto>>>(response, HttpStatus.FOUND);
	}

}

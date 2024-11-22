package com.evaluation.petshop.service;

<<<<<<< HEAD



public interface VaccinationService {
	
=======
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.VaccinationResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.dto.VaccinationDto;

public interface VaccinationService {
	ResponseEntity<ResponseStructure<List<VaccinationResponseDto>>> getAllVaccinations();

	ResponseEntity<ResponseStructure<VaccinationResponseDto>> getVaccinationById(int id);
	ResponseEntity<ResponseStructure<VaccinationResponseDto>> updateVaccinationById(int id,
			VaccinationDto vaccinationDto);
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b

}

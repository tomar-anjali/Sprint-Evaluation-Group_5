package com.evaluation.petshop.service;

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

	ResponseEntity<ResponseStructure<VaccinationResponseDto>> saveVaccination(VaccinationDto vaccinationDto);

}

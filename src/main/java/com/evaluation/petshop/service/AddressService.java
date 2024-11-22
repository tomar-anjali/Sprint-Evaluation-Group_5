package com.evaluation.petshop.service;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface AddressService {
	ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId);
}

package com.evaluation.petshop.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface AddressService {

	ResponseEntity<ResponseStructure<List<AddressResponseDto>>> getAllAddressesList();

	ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId);
}

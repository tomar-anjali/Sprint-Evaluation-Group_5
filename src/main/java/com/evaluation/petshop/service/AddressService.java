package com.evaluation.petshop.service;
<<<<<<< HEAD

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

public interface AddressService {
	ResponseEntity<ResponseStructure<List<AddressResponseDto>>> getAllAddressesList();
	ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId);
}

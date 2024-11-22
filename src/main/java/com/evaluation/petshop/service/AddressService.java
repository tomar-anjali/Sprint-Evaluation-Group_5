package com.evaluation.petshop.service;

<<<<<<< HEAD
=======
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;

>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
public interface AddressService {

	ResponseEntity<ResponseStructure<List<AddressResponseDto>>> getAllAddressesList();

	ResponseEntity<ResponseStructure<AddressResponseDto>> getAddressById(int addressId);
}

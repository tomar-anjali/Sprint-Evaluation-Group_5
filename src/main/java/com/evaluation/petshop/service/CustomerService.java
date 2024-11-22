package com.evaluation.petshop.service;

<<<<<<< HEAD


=======
import java.util.List;
import org.springframework.http.ResponseEntity;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
>>>>>>> 7c37c413061b866d72f9aae30b927371bed9e31b
public interface CustomerService {
	ResponseEntity<ResponseStructure<CustomerResponseDto>> getCustomerByFirstAndLastName(String firstName,String lastName);
	ResponseEntity<ResponseStructure<List<CustomerResponseDto>>> getAllCustomer();
}

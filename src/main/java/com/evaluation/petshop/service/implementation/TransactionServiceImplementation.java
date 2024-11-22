package com.evaluation.petshop.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.evaluation.petshop.dao.TransactionDao;
import com.evaluation.petshop.models.ResponseDto.AddressResponseDto;
import com.evaluation.petshop.models.ResponseDto.CustomerResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetCategoryResponseDto;
import com.evaluation.petshop.models.ResponseDto.PetResponseDto;
import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.models.entity.Transaction;
import com.evaluation.petshop.service.TransactionService;

@Service
public class TransactionServiceImplementation implements TransactionService {
	@Autowired
	private TransactionDao transactionDao;

	@Override
	public ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(int TransactionId) {
		Transaction transaction = transactionDao.getTransactionById(TransactionId);

		PetCategoryResponseDto petCategoryResponseDto = new PetCategoryResponseDto();

		if (transaction.getPet().getPetCategory() != null) {
			petCategoryResponseDto.setCategoryId(transaction.getPet().getPetCategory().getCategoryId());
			petCategoryResponseDto.setName(transaction.getPet().getPetCategory().getName());

		}
		PetResponseDto petResponseDto = new PetResponseDto();
		if (transaction.getPet() != null) {
			petResponseDto.setAge(transaction.getPet().getAge());
			petResponseDto.setBreed(transaction.getPet().getBreed());
			petResponseDto.setPrice(transaction.getPet().getPrice());
			petResponseDto.setDescription(transaction.getPet().getDescription());
			petResponseDto.setImageUrl(transaction.getPet().getImageUrl());
			petResponseDto.setPetId(transaction.getPet().getPetId());
			petResponseDto.setName(transaction.getPet().getName());
			petResponseDto.setPetCategory(petCategoryResponseDto);

		}

		AddressResponseDto addressResponseDto = new AddressResponseDto();
		if (transaction.getCustomer().getAddress() != null) {
			addressResponseDto.setAddressId(transaction.getCustomer().getAddress().getAddressId());
			addressResponseDto.setStreet(transaction.getCustomer().getAddress().getStreet());
			addressResponseDto.setCity(transaction.getCustomer().getAddress().getCity());
			addressResponseDto.setState(transaction.getCustomer().getAddress().getState());
			addressResponseDto.setZipCode(transaction.getCustomer().getAddress().getZipCode());
		}
		CustomerResponseDto customerResponseDto = new CustomerResponseDto();
		if (transaction.getCustomer() != null) {
			customerResponseDto.setCustomerId(transaction.getCustomer().getCustomerId());
			customerResponseDto.setAddress(addressResponseDto);
			customerResponseDto.setEmail(transaction.getCustomer().getEmail());
			customerResponseDto.setFirstName(transaction.getCustomer().getFirstName());
			customerResponseDto.setLastName(transaction.getCustomer().getLastName());
			customerResponseDto.setPhoneNumber(transaction.getCustomer().getPhoneNumber());
		}
		TransactionResponseDto transactionResponseDto = new TransactionResponseDto();
		transactionResponseDto.setTransactionId(transaction.getTransactionId());
		transactionResponseDto.setTransactionDate(transaction.getTransactionDate());
		transactionResponseDto.setPet(petResponseDto);
		transactionResponseDto.setTransactionStatus(transaction.getTransactionStatus());
		transactionResponseDto.setCustomer(customerResponseDto);
		transactionResponseDto.setAmount(transaction.getAmount());
		ResponseStructure<TransactionResponseDto> response = new ResponseStructure<>();
		response.setStatusCode(HttpStatus.FOUND.value());
		response.setMessage("Success");
		response.setData(transactionResponseDto);
		return new ResponseEntity<>(response, HttpStatus.FOUND);

	}

}

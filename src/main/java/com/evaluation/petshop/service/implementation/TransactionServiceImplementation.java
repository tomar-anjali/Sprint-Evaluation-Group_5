package com.evaluation.petshop.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList() {
		List<Transaction> list = transactionDao.getAllTransactionList();
		List<TransactionResponseDto> transactionResponseDtos = list.stream().map(data -> {
			CustomerResponseDto customerResponseDto = new CustomerResponseDto();
			if (data.getCustomer() != null) {
				customerResponseDto.setFirstName(data.getCustomer().getFirstName());
				customerResponseDto.setLastName(data.getCustomer().getLastName());
				customerResponseDto.setEmail(data.getCustomer().getEmail());
				customerResponseDto.setPhoneNumber(data.getCustomer().getPhoneNumber());
				AddressResponseDto addressResponseDto = new AddressResponseDto();
				if (data.getCustomer().getAddress() != null) {
					addressResponseDto.setAddressId(data.getCustomer().getAddress().getAddressId());
					addressResponseDto.setStreet(data.getCustomer().getAddress().getStreet());
					addressResponseDto.setCity(data.getCustomer().getAddress().getCity());
					addressResponseDto.setState(data.getCustomer().getAddress().getState());
					addressResponseDto.setZipCode(data.getCustomer().getAddress().getZipCode());
				}
				customerResponseDto.setAddress(addressResponseDto);
			}
			PetResponseDto petResponseDto = new PetResponseDto();
			if (data.getPet() != null) {
				petResponseDto.setPetId(data.getPet().getPetId());
				petResponseDto.setName(data.getPet().getName());
				petResponseDto.setAge(data.getPet().getAge());
				petResponseDto.setBreed(data.getPet().getBreed());
				petResponseDto.setDescription(data.getPet().getDescription());
				petResponseDto.setPrice(data.getPet().getPrice());
				petResponseDto.setImageUrl(data.getPet().getImageUrl());

				PetCategoryResponseDto categoryResponseDto = new PetCategoryResponseDto();
				if (data.getPet().getPetCategory() != null) {
					categoryResponseDto.setCategoryId(data.getPet().getPetCategory().getCategoryId());
					categoryResponseDto.setName(data.getPet().getPetCategory().getName());
				}
				petResponseDto.setPetCategory(categoryResponseDto);
			}
			TransactionResponseDto transactionResponseDto = new TransactionResponseDto();
			transactionResponseDto.setAmount(data.getAmount());
			transactionResponseDto.setTransactionStatus(data.getTransactionStatus());
			transactionResponseDto.setTransactionDate(data.getTransactionDate());
			transactionResponseDto.setPet(petResponseDto);
			transactionResponseDto.setCustomer(customerResponseDto);

			return transactionResponseDto;
		}).collect(Collectors.toList());
		ResponseStructure<List<TransactionResponseDto>> responseStructure = new ResponseStructure<>();
		responseStructure.setStatusCode(HttpStatus.FOUND.value());
		responseStructure.setMessage("Found");
		responseStructure.setData(transactionResponseDtos);
		return new ResponseEntity<ResponseStructure<List<TransactionResponseDto>>>(responseStructure, HttpStatus.FOUND);
	}
}

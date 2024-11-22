package com.evaluation.petshop.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluation.petshop.models.ResponseDto.TransactionResponseDto;
import com.evaluation.petshop.models.dto.ResponseStructure;
import com.evaluation.petshop.service.TransactionService;

@RequestMapping("/transaction_history")
@RestController
public class TransactionController {
	@Autowired
<<<<<<< HEAD
	private TransactionService transactionService;

	@GetMapping("/find/{transaction_id}")
	public ResponseEntity<ResponseStructure<TransactionResponseDto>> getTransactionById(
			@PathVariable int transaction_id) {
		return transactionService.getTransactionById(transaction_id);
	}
=======
	private TransactionService service;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@GetMapping()
	public ResponseEntity<ResponseStructure<List<TransactionResponseDto>>> getAllTransactionList() {
		return service.getAllTransactionList();
	}
}

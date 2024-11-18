package com.evaluation.petshop.models.ResponseDto;

import com.evaluation.petshop.models.enums.TransactionStatus;
import lombok.Data;

@Data
public class TransactionResponseDto {
	private int transactionId;
	private String transactionDate;
	private double amount;
	private CustomerResponseDto customer;
	private PetResponseDto pet;
	private TransactionStatus transactionStatus;
}

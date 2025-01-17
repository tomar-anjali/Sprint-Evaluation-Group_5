package com.evaluation.petshop.models.dto;

import com.evaluation.petshop.models.enums.TransactionStatus;

import lombok.Data;

@Data
public class TransactionDto {
	private String transactionDate;
	private double amount;
	private TransactionStatus transactionStatus;
}

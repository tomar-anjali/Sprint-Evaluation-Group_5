package com.evaluation.petshop.dao;

import java.util.List;

import com.evaluation.petshop.models.entity.Transaction;

public interface TransactionDao {
	List<Transaction> getAllTransactionList();
}

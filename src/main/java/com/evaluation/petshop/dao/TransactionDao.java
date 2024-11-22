package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.Transaction;
import java.util.List;

public interface TransactionDao {
	Transaction getTransactionById(int transactionId);
	List<Transaction> getAllTransactionList();
}

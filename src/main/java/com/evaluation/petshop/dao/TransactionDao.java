package com.evaluation.petshop.dao;

import com.evaluation.petshop.models.entity.Transaction;

public interface TransactionDao {
	Transaction getTransactionById(int transactionId);

}

package com.evaluation.petshop.dao;

<<<<<<< HEAD
import com.evaluation.petshop.models.entity.Transaction;

public interface TransactionDao {
	Transaction getTransactionById(int transactionId);
=======
import java.util.List;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

import com.evaluation.petshop.models.entity.Transaction;

public interface TransactionDao {
	
	List<Transaction> getAllTransactionList();
}

package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.Optional;
=======
import java.util.List;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.TransactionDao;
<<<<<<< HEAD
import com.evaluation.petshop.exception.DataNotFoundException;
=======
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de
import com.evaluation.petshop.models.entity.Transaction;
import com.evaluation.petshop.repository.TransactionRepository;

@Repository
public class TransactionDaoImplementation implements TransactionDao {
	@Autowired
<<<<<<< HEAD
	private TransactionRepository transactionRepository;

	@Override
	public Transaction getTransactionById(int transactionId) {
		Optional<Transaction> transaction = transactionRepository.findById(transactionId);
		if (transaction.isPresent())
			return transaction.get();
		else
			throw new DataNotFoundException("Validation Failed");

	}
=======
	private TransactionRepository repository;
>>>>>>> 25747fc1e3c8d987677e4d88f77260c5ae3a00de

	@Override
	public List<Transaction> getAllTransactionList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}

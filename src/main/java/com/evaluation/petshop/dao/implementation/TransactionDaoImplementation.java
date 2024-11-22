package com.evaluation.petshop.dao.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.evaluation.petshop.dao.TransactionDao;
import com.evaluation.petshop.models.entity.Transaction;
import com.evaluation.petshop.repository.TransactionRepository;

@Repository
public class TransactionDaoImplementation implements TransactionDao {
	@Autowired
	private TransactionRepository repository;

	@Override
	public List<Transaction> getAllTransactionList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}

package com.evaluation.petshop.dao.implementation;

<<<<<<< HEAD
import java.util.List;
import java.util.Optional;
=======
import java.util.Optional;
import java.util.List;
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.evaluation.petshop.dao.TransactionDao;
import com.evaluation.petshop.exception.DataNotFoundException;
import com.evaluation.petshop.models.entity.Transaction;
import com.evaluation.petshop.repository.TransactionRepository;

@Repository
public class TransactionDaoImplementation implements TransactionDao {
	@Autowired
	private TransactionRepository transactionRepository;
	@Override
	public Transaction getTransactionById(int transactionId) {
		Optional<Transaction> transaction = transactionRepository.findById(transactionId);
		if (transaction.isPresent())
			return transaction.get();
		else
			throw new DataNotFoundException("Validation Failed");
	}
<<<<<<< HEAD
	private TransactionRepository repository;

=======
>>>>>>> 06c62538e303723f30a1cd6de47608f36fa3ca56
	@Override
	public List<Transaction> getAllTransactionList() {
		return transactionRepository.findAll();
	}
}

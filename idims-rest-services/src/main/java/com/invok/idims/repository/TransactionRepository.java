/**
 * 
 */
package com.invok.idims.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.invok.idims.model.Transaction;

/**
 * @author Marcellus
 *
 */
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

	public List<Transaction> findAll();
	
	@SuppressWarnings("unchecked")
	public Transaction save(Transaction transaction);
	
	public Transaction findOne(Long id);
	
	void delete(Transaction deleted);
}

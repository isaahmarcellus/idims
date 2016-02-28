package com.invok.idims.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invok.idims.dto.TransactionDTO;
import com.invok.idims.model.Transaction;
import com.invok.idims.model.TransactionType;
import com.invok.idims.repository.TransactionRepository;

@Service("transactionService")
public class TransactionService {

	
	@Autowired
	public TransactionRepository transactionRepository;
	
	
	/**
	 * increaseInventoryTransaction
	 * @param locationId
	 * @param userId
	 * @param itemId
	 * @param qty
	 * @return
	 */
	public Long increaseInventoryTransaction(long locationId, long userId, long itemId, int qty) {

		Transaction transaction = new Transaction();
		transaction.setItemId(itemId);
		transaction.setLocationId(locationId);
		transaction.setQty(qty);
		transaction.setTxnType(TransactionType.INC.getName());
		transaction.setUserId(userId);
		transaction.setTimestamp(Calendar.getInstance().getTime());
		
		return transactionRepository.save(transaction).getTransactionId();
	}
	

	/**
	 * decreaseInventoryTransaction
	 * @param locationId
	 * @param userId
	 * @param itemId
	 * @param qty
	 * @return
	 */
	public Long decreaseInventoryTransaction(long locationId, long userId, long itemId, int qty) {

		Transaction transaction = new Transaction();
		transaction.setItemId(itemId);
		transaction.setLocationId(locationId);
		transaction.setQty(qty);
		transaction.setTxnType(TransactionType.DEC.getName());
		transaction.setUserId(userId);
		transaction.setTimestamp(Calendar.getInstance().getTime());
		
		return transactionRepository.save(transaction).getTransactionId();
		
	}
	
	
	/**
	 * listTransactions
	 * @param locationId
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public List<TransactionDTO> listTransactions(long locationId, Date fromDate, Date toDate) {
		
		List<TransactionDTO> transactions = new ArrayList<TransactionDTO>();
		
		List<Transaction> dbTransactions = transactionRepository.findAll();
		
		Iterator<Transaction> transactionIterator = dbTransactions.iterator();
		
		if (transactionIterator != null) {
			while (transactionIterator.hasNext()) {
				transactions.add(populateTransactionDTO((Transaction)transactionIterator.next()));
			}

		}
//		transactions.add(new TransactionDTO(1, "GroundZero", "imhaynes", "inVok Citrus 12-Pack", "DEC", 2, Calendar.getInstance()));
//		transactions.add(new TransactionDTO(2, "GroundZero", "imhaynes", "inVok Cranberry 12-Pack", "DEC", 2, Calendar.getInstance()));
//		transactions.add(new TransactionDTO(3, "SatelliteOne", "imhaynes", "inVok Citrus 12-Pack", "DEC", 2, Calendar.getInstance()));
//		transactions.add(new TransactionDTO(4, "SatelliteOne", "imhaynes", "inVok Cranberry 12-Pack", "DEC", 2, Calendar.getInstance()));
		
		return transactions;
	}
	
	
	/**
	 * @param transactionData
	 * @return
	 */
	private TransactionDTO populateTransactionDTO (Transaction transactionData) {
		
		TransactionDTO dto = new TransactionDTO();
		
		dto.setId(transactionData.getTransactionId());
		dto.setItemName(transactionData.getItem().getName());
		dto.setUserName(transactionData.getUser().getUserName());
		dto.setLocationName(transactionData.getLocation().getName());
		dto.setQty(transactionData.getQty());
		dto.setTxnType(transactionData.getTxnType());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(transactionData.getTimestamp());
		dto.setTimestamp(cal);

		return dto;
	}
	
	
}

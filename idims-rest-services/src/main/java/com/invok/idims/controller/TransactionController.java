/**
 * 
 */
package com.invok.idims.controller;

import java.util.*;
//import java.text.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invok.idims.dto.TransactionDTO;
import com.invok.idims.model.TransactionType;
import com.invok.idims.service.TransactionService;

/**
 * @author Marcellus
 * 
 * listTransactions(location, item, fromDate, toDate)
 *
 */
@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@CrossOrigin
	@RequestMapping(name="/transactions", method=RequestMethod.GET)
	public List<TransactionDTO> transactionList(@RequestParam(value="locationId", defaultValue="1") String inputLocationId,
			@RequestParam(value="from", defaultValue="") String inputFromDate,
			@RequestParam(value="to", defaultValue="") String inputToDate) throws Exception {
		
		int locationId = Integer.parseInt(inputLocationId);
		
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		//Date fromDate = !inputFromDate.equalsIgnoreCase("") ? formatter.parse(inputFromDate) : Calendar.getInstance().getTime();
		//Date toDate = !inputToDate.equalsIgnoreCase("") ? formatter.parse(inputToDate) : Calendar.getInstance().getTime();
		
		Date fromDate = Calendar.getInstance().getTime();
		Date toDate = Calendar.getInstance().getTime();
		
		// Call the service to get the list of transactions
		List<TransactionDTO> transactionList = transactionService.listTransactions(locationId, fromDate, toDate);
		
		return transactionList;
	}
	
	@RequestMapping(name="/transactions", method=RequestMethod.POST)
	public Long addTransaction(@RequestParam(value="locationId") String inputLocationId,
			@RequestParam(value="itemId") String inputItemId,
			@RequestParam(value="userId") String inputUserId,
			@RequestParam(value="qty") String inputQty,
			@RequestParam(value="txnTyp") String inputTxnType) {
		
		long locationId = Long.parseLong(inputLocationId);
		long itemId = Long.parseLong(inputItemId);
		long userId = Long.parseLong(inputUserId);
		int qty = Integer.parseInt(inputQty);
		
		// Call service to add new transaction

		Long transactionId = null;
		
		if (inputTxnType.equalsIgnoreCase(TransactionType.INC.getName())) {

			transactionId = transactionService.increaseInventoryTransaction(locationId, userId, itemId, qty);
			
		} else if (inputTxnType.equalsIgnoreCase(TransactionType.DEC.getName())) {
			
			transactionId = transactionService.decreaseInventoryTransaction(locationId, userId, itemId, qty);
			
		}
		
		// Return the resulting transaction id
		return transactionId;
	}
	
}

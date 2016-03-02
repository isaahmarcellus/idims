package com.invok.idims.transaction;

import java.util.Calendar;
import com.invok.idims.dto.TransactionDTO;

public class TransactionDTOBuilder {

	long id = 0;
	String locationName = "";
	String itemName = "";
	String userName = "";
	String txnType = "";
	int qty = 0;
	Calendar timestamp = Calendar.getInstance();
	
	public TransactionDTOBuilder withId(long id) {
		this.id = id;
		return this;
	}
	
	public TransactionDTOBuilder withItemName(String itemName) {
		this.itemName = itemName;
		return this;
	}
	
	public TransactionDTOBuilder withLocationName(String locationName) {
		this.locationName = locationName;
		return this;
	}
	
	public TransactionDTOBuilder withUserName(String userName) {
		this.userName = userName;
		return this;
	}
	
	public TransactionDTOBuilder withTxnType(String txnType) {
		this.txnType = txnType;
		return this;
	}
	
	public TransactionDTOBuilder withQty(int qty) {
		this.qty = qty;
		return this;
	}
	
	public TransactionDTOBuilder withTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public TransactionDTO build() {
		return new TransactionDTO(id, locationName, itemName, userName, txnType, qty, timestamp);
	}
	
	
}

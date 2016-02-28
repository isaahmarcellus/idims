/**
 * 
 */
package com.invok.idims.dto;

import java.util.Calendar;

/**
 * @author Marcellus Haynes
 *
 */
public class TransactionDTO {

	private long id;
	private String locationName;
	private String itemName;
	private String userName;
	private String txnType;
	private int qty;
	private Calendar timestamp;
	
	
	/** The default constructor */
	public TransactionDTO() {
		super();
		this.id = 0;
		this.locationName = "";
		this.itemName = "";
		this.userName = "";
		this.txnType = "";
		this.qty = 0;
		this.timestamp = null;
	}

	
	
	/**
	 * @param id
	 * @param locationId
	 * @param itemId
	 * @param userId
	 * @param locationName
	 * @param itemName
	 * @param userName
	 * @param txnType
	 * @param qty
	 * @param timestamp
	 */
	public TransactionDTO(long id, String locationName, String itemName, String userName,
			String txnType, int qty, Calendar timestamp) {
		super();
		this.id = id;
		this.locationName = locationName;
		this.itemName = itemName;
		this.userName = userName;
		this.txnType = txnType;
		this.qty = qty;
		this.timestamp = timestamp;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Calendar getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Calendar timestamp) {
		this.timestamp = timestamp;
	}
	
}

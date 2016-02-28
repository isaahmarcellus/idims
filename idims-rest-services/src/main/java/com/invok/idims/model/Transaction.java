package com.invok.idims.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="inventory_transaction")
public class Transaction implements Serializable {

	/** The serial UID */
	private static final long serialVersionUID = 8636592555001177204L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long transactionId;
	
	@Column(name="locationid")
	private long locationId;
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="locationid", unique= true, nullable=false, insertable=false, updatable=false)
	Location location;
	
	@Column(name="itemid")
	private long itemId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="itemid", unique= true, nullable=false, insertable=false, updatable=false)
	private Item item;
	
	@Column(name="userid")
	private long userId;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userid", unique= true, nullable=false, insertable=false, updatable=false)
	private User user;
	
	@Column(name="txntype")
	private String txnType;
	
    @Column(name="qty")
	private int qty;
    
	@Column(name="timestamp")
	@Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
	
	
	/** The default constructor */
	public Transaction() {
		super();
	}

//	public Transaction(long id, long locationId, long userId, long itemId, String txnType,
//			int qty, Date timestamp) {
//		super();
//		this.id = id;
//		this.locationId = locationId;
//		this.userId = userId;
//		this.itemId = itemId;
//		this.txnType = txnType;
//		this.qty = qty;
//		this.timestamp = timestamp;
//	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long id) {
		this.transactionId = id;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

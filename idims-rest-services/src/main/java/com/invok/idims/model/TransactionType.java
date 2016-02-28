/**
 * 
 */
package com.invok.idims.model;

/**
 * @author Marcellus
 *
 */
public enum TransactionType {
	
	INC ("INC"),
	DEC ("DEC");
	
	private final String name;
	
	TransactionType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
			
}

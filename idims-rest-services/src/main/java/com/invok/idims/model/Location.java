/**
 * 
 */
package com.invok.idims.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Marcellus Haynes
 *
 */
@Entity
@Table(name="warehouse")
public class Location implements Serializable {

	/** The serial UID */
	private static final long serialVersionUID = 7785321370454502066L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long locationId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="address1")
	private String address1;

	@Column(name="address2")
	private String address2;

	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;

	/** The default constructor */
	public Location() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param address1
	 * @param address2
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Location(Long id, String name, String description, String address1,
			String address2, String city, String state, String zip) {
		super();
		this.locationId = id;
		this.name = name;
		this.description = description;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long id) {
		this.locationId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}

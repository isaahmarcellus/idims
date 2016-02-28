package com.invok.idims.dto;

public class LocationDTO {

	private Long id;
	private String name;
	private String description;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	/**
	 * 
	 */
	public LocationDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	public LocationDTO(Long id, String name, String description,
			String address1, String address2, String city, String state,
			String zip) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

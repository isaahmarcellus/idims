package com.invok.idims.dto;

public class ItemDTO {

	private Long id;
	private String name;
	private String description;
	private String upc;
	
	/** The default constructor */
	public ItemDTO() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param upc
	 */
	public ItemDTO(Long id, String name, String description, String upc) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.upc = upc;
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

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}
	
	
}

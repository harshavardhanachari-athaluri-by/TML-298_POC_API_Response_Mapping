package com.blueyonder.customerapibff;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {

	@JsonProperty("customerId")
	private Integer id;
	@JsonProperty("customerName")
	private String name;
	@JsonProperty("activeUser")
	private Boolean active;
	
	@JsonProperty("customerId")
	public Integer getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}
	
	@JsonProperty("customerName")
	public String getName() {
		return name;
	}
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("activeUser")
	public Boolean getActive() {
		return active;
	}
	@JsonProperty("active")
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}

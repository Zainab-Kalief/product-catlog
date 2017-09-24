package com.wura.productCatlog.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
	
	@JsonProperty("name")
	private String name;
	
	public Product() {}
	public Product(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

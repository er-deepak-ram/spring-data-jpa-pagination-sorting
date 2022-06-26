package com.google.springdatajpapaginationsorting.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private long price;
	
	public Product(String name, int quantity, long price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
}

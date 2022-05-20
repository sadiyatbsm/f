package com.example.Demo.Model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ItemId")
	private int id;
	
	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name="ItemName")
	private String name;
	
	@Column(name="ItemPrice")
	private long price;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public Cart(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity=quantity;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
	
	
}

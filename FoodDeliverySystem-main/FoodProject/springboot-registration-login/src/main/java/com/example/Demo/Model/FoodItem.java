package com.example.Demo.Model;







import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="food_item")
public class FoodItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(int id, String name, long price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	private String name;
	
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
	
	
	
   
}

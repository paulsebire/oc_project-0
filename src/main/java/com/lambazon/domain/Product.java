package com.lambazon.domain;

public class Product {
	
	private Integer id;
	private String name, description, details;
	private int quantity;
	private double price;

	public Product(int id, int quantity, double price, String name, String description) {
		setId(id);
		setQuantity(quantity);
		setPrice(price);
		setName(name);
		setDescription(description);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity<0) //test if quantity under 0
		{
			quantity=0; //set to 0 if the quantity is negative
		}
		else this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price<0) //test if price under 0
		{
			price=0; //set to 0 if the price is negative
		}
		else if (price>1000) //test if price above 1000
			{
				price=1000; //set to 1000 if the price above 1000
			}
		this.price = price;
		
	}

	
	
	public double getInventoryPrice() {
		double inventoryprice=0.0; //add new variable
		inventoryprice=getPrice()*getQuantity(); //set the value by multiplying the price by the quantity
		return inventoryprice; //return the price of the stock
}
}
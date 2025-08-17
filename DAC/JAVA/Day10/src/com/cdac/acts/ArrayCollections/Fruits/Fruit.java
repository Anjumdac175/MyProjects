package com.cdac.acts.ArrayCollections.Fruits;

public class Fruit {

	private String fruitName;
	private String color;
	private double price;
	private int quantity;
	
	
	public Fruit() {
	}


	public Fruit(String fruitName, String color, double price, int quantity) {
		
		this.fruitName = fruitName;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}


	public String getFruitName() {
		return fruitName;
	}


	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Fruit [fruitName: " + fruitName + ", color: " + color + ", price: " + price + ", quantity: " + quantity
				+ "]";
	}
	
	
}

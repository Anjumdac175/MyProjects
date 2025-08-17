package com.cdac.acts.FruitarrayList;

public class FruitList {

	private String fruitName;
	private String fruitColor;
	private double price;
	private int quantity;
	public FruitList() {
	}
	
	public FruitList(String fruitName, String fruitColor, double price, int quantity) {
		this.fruitName = fruitName;
		this.fruitColor = fruitColor;
		this.price = price;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
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
		return "FruitList [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
}

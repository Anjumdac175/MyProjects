package com.cdac.acts.Fruits;

public class Fruits implements Comparable<Fruits> {
	private String fruitName;
	private String fruitColor;
	private double price;
	private Integer quantity;
	
	public Fruits() {
	}

	public Fruits(String fruitName, String fruitColor, double price, int quantity) {
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Fruits o) {
		
		return this.fruitColor.compareTo(o.fruitColor);
	}
	
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	
	

}

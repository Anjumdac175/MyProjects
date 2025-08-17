package com.cdac.acts.Apple;

import java.util.Objects;

public class Apple {

	private Double weight;
	private String color;
	private String taste;
	public Apple() {
	}
	public Apple(Double weight, String color, String taste) {
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	
	
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, taste, weight);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color) && Objects.equals(taste, other.taste)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	
	@Override
	public String toString() {
		return "Apple:{\nweight: " + weight
				+ "\ncolor: " + color
				+ "\ntaste: " + taste 
				+ "\n}";
	}
	
	
}


package com.cdac.Furniture.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="furniture")
public class Furniture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long furnitureId;
	
	@NotBlank(message="Name should not blank")
	@Size(min = 3, max = 15)
	private String furnitureName;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Min(1)
	@Max(1000000)
	private double price;
	
	@NotBlank(message="choose atleast one color")
	private String color;
	
	@NotBlank(message="choose a perfect material")
	private String material;
	
	
	public Furniture() {
		super();
	}
	public Furniture(Long furnitureId, String furnitureName, Category category, double price, String color,
			String material) {
		super();
		this.furnitureId = furnitureId;
		this.furnitureName = furnitureName;
		this.category = category;
		this.price = price;
		this.color = color;
		this.material = material;
	}
	public Long getFurnitureId() {
		return furnitureId;
	}
	public void setFurnitureId(Long furnitureId) {
		this.furnitureId = furnitureId;
	}
	public String getFurnitureName() {
		return furnitureName;
	}
	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}


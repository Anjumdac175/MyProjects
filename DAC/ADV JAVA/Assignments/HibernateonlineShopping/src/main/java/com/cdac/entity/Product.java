package com.cdac.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Prodcuts")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productId")
	private Integer productId;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productDescription")
	private String productDesc;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="productIamgeUrl")
	private String productImg;
	
	@Column(name="categoryId")
	private Integer categoryId;
	
	public Product() {}
	
	public Product(Integer productId, String productName, String productDesc, Double price, String productImg,
			Integer categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
		this.productImg = productImg;
		this.categoryId = categoryId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProductImg() {
		return productImg;
	}
	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	
}

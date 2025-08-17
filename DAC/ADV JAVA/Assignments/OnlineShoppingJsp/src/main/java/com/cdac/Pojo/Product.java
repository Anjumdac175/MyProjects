package com.cdac.Pojo;

public class Product {
	private Integer productId;
	private String productName;
	private String productDes;
	private String productimg;
	private Double price;
	private Integer categoryId;
	
	public Product() {}

	public Product(Integer productId,String productName, String productDes, String productimg, Double price, Integer categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDes = productDes;
		this.productimg = productimg;
		this.price = price;
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDes() {
		return productDes;
	}

	public void setProductDes(String productDes) {
		this.productDes = productDes;
	}

	public String getProductimg() {
		return productimg;
	}

	public void setProductimg(String productimg) {
		this.productimg = productimg;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}

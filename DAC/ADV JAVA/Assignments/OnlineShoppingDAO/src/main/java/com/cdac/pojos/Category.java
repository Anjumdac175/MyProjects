package com.cdac.pojos;

public class Category {
	
	private String categoryName;
	private String categoryDesc;
	private String categoryImg;
	private Integer categoryId;
	
	public Category() {}
	
	public Category( Integer categoryId,String categoryName, String categoryDesc, String categoryImg) {
		super();
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
		this.categoryImg = categoryImg;
		this.categoryId = categoryId;
	}
	

	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getCategoryImg() {
		return categoryImg;
	}

	public void setCategoryImg(String categoryImg) {
		this.categoryImg = categoryImg;
	}


}

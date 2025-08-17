package com.cdac.acts.MobilePhone;

import java.io.Serializable;
import java.util.Objects;

import com.cdac.acts.PhoneOs;

public class MobilePhone implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4944361798330779592L;
	
	//serialNo, brand, os, color, price, ram
	private String serialNo;
	private String brand;
	private PhoneOs os;
	private String color;
	private Double price;
	private Integer ram;
	
	public MobilePhone() {
	}

	public MobilePhone(String serialNo, String brand, PhoneOs os, String color, Double price, Integer ram) {
		this.serialNo = serialNo;
		this.brand = brand;
		this.os = os;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public PhoneOs getOs() {
		return os;
	}

	public void setOs(PhoneOs os) {
		this.os = os;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, color, os, price, ram, serialNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobilePhone other = (MobilePhone) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && os == other.os
				&& Objects.equals(price, other.price) && Objects.equals(ram, other.ram)
				&& Objects.equals(serialNo, other.serialNo);
	}

	@Override
	public String toString() {
		return "MobilePhone:"
				+ "\nserialNo: " + serialNo 
				+ "\tbrand: " + brand 
				+ "\tos: " + os 
				+ "\tcolor: " + color
				+ "\tprice: "+ price 
				+ "\tram:" + ram 
				+ "\n";
	}	
	
}

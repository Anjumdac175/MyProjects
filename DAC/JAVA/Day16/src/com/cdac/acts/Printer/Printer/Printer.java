package com.cdac.acts.Printer.Printer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.cdac.acts.Printer.PrinterType;

public class Printer implements Serializable{

	/**
	 * It for trscking if booth read and write are working on same versions without any alternate modifications
	 */
	private static final long serialVersionUID = 6644602597166311366L;
	
	private String serialNo;
	private String modelNo;
	private Double price;
	private PrinterType type;
	private LocalDate manufacturingDate;
	
	public Printer() {
	}

	public Printer(String serialNo, String modelNo, double price, PrinterType type, LocalDate manufacturingDate) {
		this.serialNo = serialNo;
		this.modelNo = modelNo;
		this.price = price;
		this.type = type;
		this.manufacturingDate = manufacturingDate;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public PrinterType getType() {
		return type;
	}

	public void setType(PrinterType type) {
		this.type = type;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(manufacturingDate, modelNo, price, serialNo, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Printer other = (Printer) obj;
		return Objects.equals(manufacturingDate, other.manufacturingDate) && Objects.equals(modelNo, other.modelNo)
				&& Objects.equals(price, other.price) && Objects.equals(serialNo, other.serialNo) && type == other.type;
	}

	@Override
	public String toString() {
		return "Printer: {\n"
				+ "serialNo: " + serialNo 
				+ "\nmodelNo: " + modelNo 
				+ "\nprice: " + price
				+ "\ntype: " + type
				+ "\nmanufacturingDate: " + manufacturingDate + "\n}";
	}
	
	
}

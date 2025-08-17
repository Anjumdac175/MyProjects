package com.cdac.firstHibernet.entity;

public class Users {

	private String userName;
	private String password;
	private String role;
	private Double balance;
	
	public Users() {}

	public Users(String userName, String password, String role, Double balance) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}

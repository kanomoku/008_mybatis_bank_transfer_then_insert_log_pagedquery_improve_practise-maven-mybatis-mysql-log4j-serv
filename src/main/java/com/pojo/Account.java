package com.pojo;

public class Account {
	// id
	private int id;
	// 账号
	private String accNo;
	// 密码
	private int password;
	// 钱数
	private double balance;
	// 名字
	private String name;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getAccNo() {
		return accNo;
	}

	public final void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public final int getPassword() {
		return password;
	}

	public final void setPassword(int password) {
		this.password = password;
	}

	public final double getBalance() {
		return balance;
	}

	public final void setBalance(double balance) {
		this.balance = balance;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

}

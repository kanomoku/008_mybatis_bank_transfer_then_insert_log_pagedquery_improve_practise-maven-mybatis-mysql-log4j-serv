package com.pojo;

public class LogInfo {
	// id
	private int id;
	// 转出账户
	private String accOut;
	// 转入账户
	private String accIn;
	// 转账金额
	private double money;

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getAccOut() {
		return accOut;
	}

	public final void setAccOut(String accOut) {
		this.accOut = accOut;
	}

	public final String getAccIn() {
		return accIn;
	}

	public final void setAccIn(String accIn) {
		this.accIn = accIn;
	}

	public final double getMoney() {
		return money;
	}

	public final void setMoney(double money) {
		this.money = money;
	}

}

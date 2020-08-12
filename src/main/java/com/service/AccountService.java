package com.service;

import java.io.IOException;

import com.pojo.Account;

public interface AccountService {
	/**
	 * 账户密码不匹配
	 */
	int ACCOUNT_PASSWORD_NOT_MATCH = 1;
	/**
	 * 余额不足
	 */
	int ACCOUNT_BALANCE_IS_NOT_ENOUGH = 2;
	/**
	 * 账户姓名不匹配
	 */
	int ACCOUNT_NAME_NOT_MATCH = 3;
	/**
	 * 转账失败
	 */
	int ERROR = 4;
	/**
	 * 转账成功
	 */
	int SUCCESS = 5;

	int transfer(Account accountIn, Account accountOut) throws IOException;

}

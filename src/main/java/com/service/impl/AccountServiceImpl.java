package com.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.pojo.Account;
import com.pojo.LogInfo;
import com.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public int transfer(Account accountIn, Account accountOut) throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
		SqlSession session = build.openSession();

		Account accountSelected = session.selectOne("com.mapper.AccountMapper.selByAccnoPwd", accountOut);
		if (accountSelected != null) {
			if (accountSelected.getBalance() > accountOut.getBalance()) {
				Account accountInSelected = session.selectOne("com.mapper.AccountMapper.selByAccnoNane", accountIn);
				if (accountInSelected != null) {
					accountOut.setBalance(-accountOut.getBalance());
					int index = session.update("com.mapper.AccountMapper.updBalanceByaccNo", accountOut);
					index += session.update("com.mapper.AccountMapper.updBalanceByaccNo", accountIn);
					if (index == 2) {
						LogInfo log = new LogInfo();
						log.setAccOut(accountOut.getAccNo());
						log.setAccIn(accountIn.getAccNo());
						log.setMoney(accountIn.getBalance());
						session.insert("com.mapper.LogMapper.insLog", log);
						// 日志文件
						Logger logger = Logger.getLogger(AccountServiceImpl.class);
						logger.info(log.getAccOut() + "给" + log.getAccIn() + "在" + new Date().toLocaleString() + "转了"
								+ log.getMoney());
						session.commit();
						session.close();
						return SUCCESS;
					} else {
						session.rollback();
						session.close();
						return ERROR;
					}
				} else {
					return ACCOUNT_NAME_NOT_MATCH;
				}
			} else {
				return ACCOUNT_BALANCE_IS_NOT_ENOUGH;

			}
		} else {
			return ACCOUNT_PASSWORD_NOT_MATCH;
		}
	}

}

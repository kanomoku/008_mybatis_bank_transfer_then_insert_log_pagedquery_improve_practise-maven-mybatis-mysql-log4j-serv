package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Account;
import com.service.AccountService;
import com.service.impl.AccountServiceImpl;

@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
	AccountService accountService = new AccountServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String accNoOut = req.getParameter("accNoOut");
		String passwordOut = req.getParameter("passwordOut");
		String balance = req.getParameter("balance");
		String accNoIn = req.getParameter("accNoIn");
		String nameIn = req.getParameter("nameIn");

		Account accountOut = new Account();
		Account accountIn = new Account();
		accountOut.setAccNo(accNoOut);
		accountOut.setPassword(Integer.parseInt(passwordOut));
		accountOut.setBalance(Double.parseDouble(balance));
		accountIn.setBalance(Double.parseDouble(balance));
		accountIn.setAccNo(accNoIn);
		accountIn.setName(nameIn);

		int index = accountService.transfer(accountIn, accountOut);

		if (index == AccountService.SUCCESS) {
//			resp.sendRedirect("/mybatis008_bank_transfer_practise/log");原来不是maven项目这么写
			resp.sendRedirect("/log");

		} else {
			HttpSession session = req.getSession();
			session.setAttribute("code", index);
//			resp.sendRedirect("/mybatis008_bank_transfer_practise/error/error.jsp");原来不是maven项目这么写
			resp.sendRedirect("/error/error.jsp");
		}
	}

}

package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.PageInfo;
import com.service.LogService;
import com.service.impl.LogServiceImpl;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/log")
public class LogServlet extends HttpServlet {

	LogService logService = new LogServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pageNumStr = req.getParameter("pageNum");
		String pageSizeStr = req.getParameter("pageSize");
		int pageNum = 1;
		int pgeSize = 2;
		if (pageNumStr != null && !"".equals(pageNumStr)) {
			pageNum = Integer.parseInt(pageNumStr);
		}
		if (pageSizeStr != null && !"".equals(pageSizeStr)) {
			pgeSize = Integer.parseInt(pageSizeStr);
		}

		PageInfo pageInfo = logService.show(pageNum, pgeSize);

		req.setAttribute("pageInfo", pageInfo);
		req.getRequestDispatcher("/log.jsp").forward(req, resp);
	}

}

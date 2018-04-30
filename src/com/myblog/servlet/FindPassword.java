package com.myblog.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;


public class FindPassword extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("phone");
		String userName = request.getParameter("userName");
		User user = new User();
		BigDecimal phone = new BigDecimal(str);
		user.setPhone(phone);
		user.setUserName(userName);
		UserDao userDao = new UserDaoImpl();
		long count = userDao.findPassword(user);
		if(count != 0) {
			request.setAttribute("userName", userName);
			System.out.println("request have a attribute: [userName] :" + userName);
			request.getRequestDispatcher("${request.getContextPath()}/../changePassword.jsp").forward(request, response);
		}else {
			response.getWriter().println("<script>alert('不存在该用户名或电话号码')</script>");
		}
	}

}

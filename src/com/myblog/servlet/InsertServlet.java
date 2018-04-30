package com.myblog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.mysystem.dao.UserDao;
import com.java.mysystem.daoImpl.UserDaoImpl;
import com.java.mysystem.domain.User;
import com.myblog.domain.JSONObject;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("registerUserName");
		String password = request.getParameter("registerUserPassword");
		BigDecimal phone = new BigDecimal(request.getParameter("registerPhone"));
		String blog = request.getParameter("registerBlogName");
		String message = request.getParameter("registerMessage");
		String sex = request.getParameter("registerSex");
		String address = request.getParameter("registerAddress");
		String result;
		System.out.println("message : " + message);
		PrintWriter out = response.getWriter();
		if(message.equals("�û�������")){
			User user = new User(userName, password, address, phone, sex, blog);
			System.out.println(user);
			UserDao userDao = new UserDaoImpl();
			System.out.println(userDao);
			userDao.addUser(user);
			result = "ע��ɹ�,�Ƿ�Ҫֱ�ӵ�¼��";
			System.out.println("result : " + result);
			out.write(result);
		} else{
			result = "ע��ʧ��";
			out.print(result);
		}
	}

}

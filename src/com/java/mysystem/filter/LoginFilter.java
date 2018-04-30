package com.java.mysystem.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {
	private FilterConfig filterConfig;
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String NoCheck = request.getServletContext().getInitParameter("NoCheck");
		HttpServletRequest hRequest = (HttpServletRequest)request;
		HttpServletResponse hResponse = (HttpServletResponse)response;
		String url = hRequest.getServletPath();
		System.out.println(url);
		String[] NoCheckUrl = NoCheck.split(",");
		for(String str : NoCheckUrl) {
			if(str.equals(url)) {
				System.out.println(123);
				chain.doFilter(request, response);
				return;
			}
		}
		String userName = (String)hRequest.getSession().getAttribute("userName");
		if(userName != null){
			chain.doFilter(request, response);
			return;
		} else{
			hResponse.sendRedirect(request.getServletContext().getContextPath() + "/login.jsp");			
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}

	@Override
	public void destroy() {
	}

}

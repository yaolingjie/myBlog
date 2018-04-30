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

public class ReverseString implements Filter {
	private FilterConfig filterConfig;
   	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
				response.setContentType("text/html;charset=utf-8");
				request.setCharacterEncoding("utf-8");
				chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig =  fConfig;
	}

}

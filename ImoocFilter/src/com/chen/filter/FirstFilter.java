package com.chen.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destory------FirstFilter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Start......doFilter------FirstFilter");
//		chain.doFilter(request, response);
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse respon = (HttpServletResponse) response;
		//重定向
		respon.sendRedirect(req.getContextPath()+"/main.jsp");
		//转发
//		req.getRequestDispatcher("main.jsp").forward(request, response);
//		req.getRequestDispatcher("main.jsp").include(request, response);

		System.out.println("End......doFilter------FirstFilter");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init------FirstFilter");
	}

}

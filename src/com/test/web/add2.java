package com.test.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/add2")
public class add2 extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = res.getWriter();

		String[] s = req.getParameterValues("x");

		int result = 0;
		
		for(int i = 0 ; i< s.length; i++) {
			int in = Integer.parseInt(s[i]);
			result += in;
			
		}
		
		out.println(result);

		
	}
}

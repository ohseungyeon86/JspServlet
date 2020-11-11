package com.test.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calcal")
public class calcul2 extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		//req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = res.getWriter();

		int x = Integer.parseInt(req.getParameter("x"));
	
		String s = req.getParameter("plusminus");
		
		int result = 0;
		
		ServletContext sc = req.getServletContext();
		//HttpSession hs = req.getSession();
		//Cookie[] c = req.getCookies();

		if(s.equals("=")) {
			if(sc.getAttribute("op").equals("+")) {
				result = (Integer)sc.getAttribute("value") + x;
				//result = (Integer)hs.getAttribute("value") + x;
			}
			if(sc.getAttribute("op").equals("-")) {
				result = (Integer)sc.getAttribute("value") - x;
				//result = (Integer)hs.getAttribute("value") - x;
			}
			out.println(result);
		}else {
			sc.setAttribute("value", x);
			sc.setAttribute("op", s);
			//hs.setAttribute("value", x);
			//hs.setAttribute("op", s);
			res.sendRedirect("calcul2.html");
			//Cookie valc = new Cookie("val", String.valueOf(x));
			//Cookie opc = new Cookie("op", s);
			//res.addCookie(valc);
			//res.addCookie(opc);
			
		}
		
		

		
	}
}

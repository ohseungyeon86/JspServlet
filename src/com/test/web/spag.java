package com.test.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/spag")
public class spag extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = 0;
		String num_ = req.getParameter("n");
		if(num_ != null && !num_.equals("")) {
			num = Integer.parseInt(num_);
		}
		
		String result;
		
		if(num%2 != 0) {
			result = "horse";
		}else {
			result = "jjaksu";
		}
		String [] names = {"dragon", "tonado"};
		Map<String, Object> notice = new HashMap<String, Object>();
		notice.put("id", 1);
		notice.put("title", "hwhwhwhwhwhwh");
		
		req.setAttribute("result", result);
		req.setAttribute("names", names);
		req.setAttribute("notice", notice);
		
		RequestDispatcher rd =  req.getRequestDispatcher("spag.jsp");
		rd.forward(req, resp);
		
	}
		
}

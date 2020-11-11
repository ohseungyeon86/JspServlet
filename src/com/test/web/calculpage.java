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

@WebServlet("/calcalpage")
public class calculpage extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("<style>");
		out.write("input{");
		out.write("width:50px;");
		out.write("height:50px;");
		out.write("}");
		out.write(".output{");
		out.write("background: red;");
		out.write("height:50px;");
		out.write("font-weight: bold;");
		out.write("text-align: right;");
		out.write("padding: 0px 5px;");
		out.write("}");

		out.write("</style>");
		out.write("</head>");
		out.write("<body>");
		out.write("calculation");
		out.write("<form action=\"calcal2\" method=\"post\">");
		out.write("<table>");
		out.write("<tr>");
		out.printf("<td class=\"output\" colspan=\"4\">%d</td>", 3+5);
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"CE\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"C\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"BS\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"÷\"></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"7\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"8\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"9\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"X\"></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"4\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"5\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"6\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"-\"></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"1\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"2\"></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"3\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"+\"></td>");
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td></td>");
		out.write("<td><input type=\"submit\" name=\"val\" value=\"0\"></td>");
		out.write("<td><input type=\"submit\" name=\"dot\" value=\".\"></td>");
		out.write("<td><input type=\"submit\" name=\"op\" value=\"=\"></td>");
		out.write("</tr>");
					
		out.write("</table>");
		out.write("결과");
		out.write("</form>");
		out.write("</body>");
		out.write("</html>");
		
	}
}

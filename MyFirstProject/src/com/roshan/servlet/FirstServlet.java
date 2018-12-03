package com.roshan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "My first servlet file.", urlPatterns = { "/first" })
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userAddr = request.getParameter("userAddr");
		String userG = request.getParameter("gender");
		String userCheck = request.getParameter("Swim");
		String location = request.getParameter("location");
		
		
		out.println("<!DOCTYPE html>  <html> <head> <title>Application form</title></head><body>");
		out.println("<table>");
		out.println("<tr><th>Name :</th>");
		out.println("<td>" + userName +"</td></tr>");
		out.println("<tr><th>Address :</th>");
		out.println("<td>" + userAddr +"</td></tr>");
		out.println("<tr><th>Gender :</th>");
		out.println("<td>" + userG +"</td></tr>");
		out.println("<tr><th>Hobbies :</th>");
		out.println("<td>" + userCheck +"</td></tr>");
		out.println("<tr><th>Location :</th>");
		out.println("<td>" + location +"</td></tr>");
		out.println("</table>");
		//out.println(userName);
		out.println("</body> </html>");
		
		
		//out.println(userName);
		//out.println(userAddr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

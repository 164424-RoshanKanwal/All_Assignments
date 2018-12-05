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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userAddr = request.getParameter("userAddr");
		String userG = request.getParameter("gender");
		//String userHob[] = request.getParameterValues("Hobbies");
		String location = request.getParameter("location");
		
	//	for(String hobby : userHob){System.out.print(hobby + ' ');}
		
		
		
		out.println("<!DOCTYPE html>  <html> <head> <title>Application form</title>");
		out.println("<style>");
		out.println("table, th, td, tr {border: 1px solid black}");
		out.println("</style>");
		out.println("</head><body>");
		out.println("<table >");
		out.println("<tr><th>Name :</th>");
		out.println("<td>" + userName +"</td></tr>");
		out.println("<tr><th>Address :</th>");
		out.println("<td>" + userAddr +"</td></tr>");
		out.println("<tr><th>Gender :</th>");
		out.println("<td>" + userG +"</td></tr>");
		
		out.println("<tr><th>Hobbies :</th>");
		out.println("<td >" );
		//int index=0;
	//	int userHobLen = userHob.length;
	//	out.println(for(index =0; index < userHobLen; index++){System.out.print(userHob[index] + ' ');}
		//out.println(");");
		
		out.println("</td></tr>" );
		
		out.println("</br>");
		out.println("<tr><th>Location :</th>");
		out.println("<td>" + location +"</td></tr>");
		out.println("</table>");
	
		out.println("</body> </html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package com.roshan.requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "Understanding request dispatcher", urlPatterns = { "/reqDispatcher" })
public class ClassRequestDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClassRequestDispatcher() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPas");	
		
		if(userPassword.equalsIgnoreCase("roshan") && userName.equals("Kanwal")){
			
			//userPassword.equalsIgnoreCase("roshan") && 
			RequestDispatcher reqD = request.getRequestDispatcher("HTML/userForm.html");
			//RequestDispatcher reqD = request.getRequestDispatcher("HTML/welcome.html");
			reqD.forward(request, response);
		
		}
		else{
			
			//out.println("You are not an authorized user");
			RequestDispatcher reqD = request.getRequestDispatcher("HTML/login.html");
			//RequestDispatcher reqD = request.getRequestDispatcher("HTML/userForm.html");
			
			reqD.forward(request, response);// why not use forward
			out.println("You are not an authorized user");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

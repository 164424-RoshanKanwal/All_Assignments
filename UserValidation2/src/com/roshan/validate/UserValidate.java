package com.roshan.validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roshan.util.DAOUtility;


@WebServlet(description = "User Validation Page", urlPatterns = { "/validate" })
public class UserValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserValidate() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		String userType = getUserType(username, password);
		
		
		RequestDispatcher reqDispatcher = null;
		if(userType.equals("Admin")){
			out.println("Admin");
			reqDispatcher = request.getRequestDispatcher("/admin");
			reqDispatcher.forward(request, response);
		}
		else if(userType.equals("User")){
			reqDispatcher = request.getRequestDispatcher("/user");
			reqDispatcher.forward(request, response);
		}
		else{
			out.println("Invalid User");
			reqDispatcher = request.getRequestDispatcher("html/login.html");
			reqDispatcher.include(request, response);
		}

	}

	
	private String getUserType(String username, String password) {
		
		IUserDAO dao = DAOUtility.getUserDAO();
		String userType = dao.getUserType(username, password);
		
		
		
		return userType;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

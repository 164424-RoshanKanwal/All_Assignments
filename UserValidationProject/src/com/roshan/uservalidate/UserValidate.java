package com.roshan.uservalidate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.roshan.dao.UserDAO;


@WebServlet(description = "This servlet do user validation.", urlPatterns = { "/uservalidate" })
public class UserValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserValidate() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPwd");
		String userType = null;
		try{
		userType = getUserType(userName, password);
		}
		catch(Exception e){
			out.println("e");
		}
		RequestDispatcher reqD = null;
		
		if(userType.equals("Admin")){
			reqD = request.getRequestDispatcher("/admin");
		//	out.println(" <h1>Welcome Admin " + userName + "</h1>");
		}
		else if (userType.equals("User")) {
			reqD = request.getRequestDispatcher("/user");
			out.println(" <h1>Welcome User</h1> " + userName);
		}else {
			reqD = request.getRequestDispatcher("/invalid");
			out.println(" <h1>Invalid User</h1> ");
		}
		reqD.forward(request, response);
	}

	
	private String getUserType(String userName, String password) {
		
		UserDAO dao = new UserDAO();
		String userT = dao.getUserType(userName, password);
		
		return userT;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	
}

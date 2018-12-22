<%@page import="com.roshan.userValidation.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userName = request.getParameter("userName");
String password = request.getParameter("pwd");

String userType = getUserType(userName, password);
out.println(userType);
RequestDispatcher reqDispatcher = null;


if(userType.equalsIgnoreCase("admin")){
	reqDispatcher = request.getRequestDispatcher("admin.jsp");
	reqDispatcher.forward(request, response);
}
else if(userType.equalsIgnoreCase("user")){
	reqDispatcher = request.getRequestDispatcher("user.jsp");
	reqDispatcher.forward(request, response);
}
else{
	out.println("Seems you are quiet lost.  Try Again");
	reqDispatcher = request.getRequestDispatcher("login.jsp");
	reqDispatcher.include(request, response);
}
%>

<%! public String getUserType(String userName, String password){
	
	UserDAO dao = new UserDAO();
	String userType = dao.getUserT(userName, password);
	return userType;
} %>


</body>
</html>
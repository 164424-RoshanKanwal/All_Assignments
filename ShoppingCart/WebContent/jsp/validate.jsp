<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="com.roshan.database.ConnectionFactory"%>
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
String password = request.getParameter("password");

out.println(userName);
out.println(password);

boolean status = getUserStatus(userName, password);
out.println(status);
%>

<%!
public static boolean getUserStatus(String userName, String password) throws ClassNotFoundException{
	
	try{
	Connection connection = ConnectionFactory.getDBConnection();
	System.out.println(connection);
	PreparedStatement prepareStatement = connection.prepareStatement("select * from customer where name = ? and password=?");
	prepareStatement.setString(1, userName);
	prepareStatement.setString(2, password);
	
	ResultSet set = prepareStatement.executeQuery();
	
	System.out.println(set);
	
	while (set.next()) {
		if (set.getString("name").equals(userName)
				&& set.getString("password").equals(password)) {
			return true;
		}
	ConnectionFactory.closeConnection();
	}
	
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
	return false;
}


%>
</body>
</html>
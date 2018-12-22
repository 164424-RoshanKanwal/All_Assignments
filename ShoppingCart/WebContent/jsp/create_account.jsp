<%@page import="com.roshan.database.ConnectionFactory2"%>
<%@ page import ="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String name =request.getParameter("name");
String email =request.getParameter("email");
String mobileNo =request.getParameter("mobile");//number in html and varchar in sql
String address =request.getParameter("address");
String password =request.getParameter("password");
out.println(name);
out.println(email);
out.println(mobileNo);
out.println(password);
out.println(address);

boolean status = addToDatabase(name, email, mobileNo, address, password);
if (status==true){
	response.sendRedirect("/ShoppingCartVersion2/jsp/signin.jsp");
}
%>


<%!
public static boolean addToDatabase(String name, String email, String mobileNo, String address, String password){
	boolean status2=false;
	try{
	Connection conn = ConnectionFactory2.getConnection();
	PreparedStatement statement = conn.prepareStatement("insert into customer values (cid_sequence.nextval, ?,?,?,?,?)");
	statement.setString(1, name);
	statement.setString(2, email);
	statement.setString(3, mobileNo);
	statement.setString(4, address);
	statement.setString(5, password);
	
	statement.executeUpdate();
	System.out.println("done");
	status2=true;
	
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
	
	
	return status2;
}



%>


</body>
</html>
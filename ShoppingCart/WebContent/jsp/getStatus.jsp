<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page import="com.roshan.database.ConnectionFactory2"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public static boolean getUserStatus(String userName, String password){
	boolean status2 =false;
	System.out.println("helloutfa");
	try {
		System.out.println("hellouttry");
		Connection connection = ConnectionFactory2.getConnection();
		System.out.println(connection);
		 PreparedStatement statement = connection.prepareStatement("select * from customer where name =? and password =?");
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet set = statement.executeQuery();
		System.out.println("hellout");
			if (set.next()) {
					System.out.println("hello");
				status2 = true;
				} 
			

	 } catch (SQLException e) {
		e.printStackTrace();
	} 

	return status2;
	
} %>

</body>
</html>
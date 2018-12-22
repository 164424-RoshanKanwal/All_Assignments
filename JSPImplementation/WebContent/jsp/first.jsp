<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% int i =34;
int j = 45;
out.println(doIt());

%>

<%for(int index =0; index<5; index++){%>
<br>	The series is : <%=index %>
<%} %>


<%! 
public static String doIt(){

	return "Hello";
}
%>

</body>
</html>
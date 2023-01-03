<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/NewloginServlet" method="post">
	<label>moblie number: </label><br>
	<input type="text" name="phn">
	<br>
	<input type="submit" value="login">
	</form>
</body>
</html>
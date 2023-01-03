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
<h1> User Registration Page</h1>
<form action="<%=request.getContextPath() %>/DataBaseServlet" method="post">
Enter username <input type="text" name="username" placeholder="Enter username"/><br></br>
Enter userid <input type="text" name="userid" placeholder="Enter userid"/><br></br>
Enter Phonenumber <input type="text" name="phno" placeholder="Enter PhoneNumber"/><br></br>
 <input type="submit" value="login"/><br></br>
</form>

    
</body>
</html>
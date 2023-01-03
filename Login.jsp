<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--Declartion--%>
<% int a=10; %>

<!-- SCRIPTLET -->
<%  
    int x=10;
    int y=20;
    int sum=x+y;
    
    out.println("Hello from Login jsp...."+sum);
    //String username=(String)request.getAttribute("user");
%>

   <%--Expression--%>
   <%=x*y%>
   <h1>Welcome ${user}!</h1>
</body>
</html>   
                                                                                                                                                                                                                                                                                                                                                                                                                                      
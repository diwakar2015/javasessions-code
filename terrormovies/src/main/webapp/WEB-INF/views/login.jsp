<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" " http://www.w3.org/TR/html4/loose.dtd ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Terror movies</title>
</head>
<body>

<% if (request.getParameter("error") != null ){
         out.println("ERROR LOGIN");
    }
%>
<c:url value="/j_spring_security_check" var="loginUrl" />
<center><h3>Login to the application</h3></center>
    <form action="${loginUrl}" method="post">
        Username<input type="text" name="j_username"/><br/>
        Password<input type="text" name="j_password"/><br/>
        <input type="submit"/>
    </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.jsp.examples.studentstore.StudentStore" %>
    <%@page import="com.jsp.examples.model.Student" %>
    <%@page import="java.util.ArrayList" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Database</title>
</head>
<body>
<center>

<h1>Student List</h1>


<%



ArrayList<Student> list = StudentStore.getInstance().getListOfStudents(); 

for(Student s : list)
{



%>

<h3>Name: <%=s.getName() %></h3> <h3>Age : <%=s.getAge() %></h3> <h3>Country : <%=s.getCountry() %></h3>

<%


}

%>


</center>


</body>
</html>
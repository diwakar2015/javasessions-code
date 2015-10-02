<!DOCTYPE html>
<%@page import="com.employeemanagement.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.employeemanagement.dao.EmployeeDAO"%>
<%@page import="com.employeemanagement.model.User"%>
<html lang="en">

<%
User userInfo = null;
 session = request.getSession();
 
 String userName = "";

if(session!= null)
{
	 userInfo = (User)session.getAttribute("user");
	if(userInfo==null)
	{
		response.sendRedirect("index.jsp?status=notLoggedIn");
	}
	
}

else
{
	response.sendRedirect("index.jsp?status=notLoggedIn");
}
if(userInfo!=null)
userName = userInfo.getUserName();
%>


<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Employee management Home Page</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/small-business.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
             
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                     <li>
                        <a href="home.jsp">Browse Employee List</a>
                    </li>
                    <li>
                        <a href="add.jsp">Add New Employee</a>
                    </li>
                     <li>
                        <a href="profile.jsp">Profile</a>
                    </li>
                     <li>
                        <a href="contact.jsp">Contact Us</a>
                    </li>
                  
	
	
	                  <li>
                       <a href="#">Welcome !! <%=userName %></a> 
                    </li>
                    
                      <li>
                        <a href="logout.jsp">Logout</a>
                    </li>
                   
                </ul>
            </div>
            <!-- /.navbar-collapse --> 
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

      
        <div class="row">
           
           
           <h3>List of employees</h3>
           
           
           
           <table class="table table-striped">
    <thead>
      <tr>
        <th>EmpId</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Department</th>
         <th>Action</th>
         <th>Action</th>
      </tr>
    </thead>
    <tbody>
    
    <%
    
    EmployeeDAO empDAO = new EmployeeDAO();
    ArrayList<Employee> empList = empDAO.getAllEmployees();
            		
    for(Employee emp : empList)
    {
    
    %>
 
      <tr>
        <td><%=emp.getEmpId() %></td>
        <td><%=emp.getEmpName() %></td>
        <td><%=emp.getSalary() %></td>
        <td><%=emp.getDept() %></td>
         <td><a href="edit.jsp?action=edit&empid=<%=emp.getEmpId()%>">Edit</a></td>
        <td><a href="UserAction?action=delete&empid=<%=emp.getEmpId()%>">Delete</a></td>
      </tr>
      
   <% } %>
 
    </tbody>
  </table>
           
           
           
           
           
           
           
           
           
           
           
        </div>
       

    

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2015</p> Designed By Diwakar
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>

<!DOCTYPE html>
<%@page import="com.employeemanagement.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.employeemanagement.dao.EmployeeDAO"%>
<%@page import="com.employeemanagement.model.User"%>
<html lang="en">
<%

 session = request.getSession();

if(session!= null)
{
	User userInfo = (User)session.getAttribute("user");
	if(userInfo==null)
	{
		response.sendRedirect("index.jsp?status=notLoggedIn");
	}
	
}

else
{
	response.sendRedirect("index.jsp?status=notLoggedIn");
}
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
                        <a href="contact.jsp">Contact Us</a>
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
           
           
           <h3>Add new employee</h3>
           </br>
           
           
    
 <form name="registrationForm" action="UserAction"  method="post">
<div class="col-lg-5">
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">EmpId&nbsp&nbsp&nbsp</span>
  <input type="text" class="form-control" name="empid" placeholder="Enter the emp Id" aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Name&nbsp&nbsp&nbsp&nbsp</span>
  <input type="text" class="form-control" name="name" placeholder="Enter the employee name" aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Salary&nbsp&nbsp&nbsp&nbsp&nbsp</span>
  <input type="text" class="form-control" name="salary" placeholder="Enter your salary"  aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Department</span>
  <input type="text" class="form-control" name="dept" placeholder="Enter your department" aria-describedby="sizing-addon1">
</div></br>

 
<input class="btn btn-primary btn-lg" type ="submit" name="submit" value="Add Employee" />  
</div>

</form>
           
           
           
           
           
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

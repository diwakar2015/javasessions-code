<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Employee Manager Application</title>

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
    
    <script type="text/javascript" src="js/empmanager.js"></script>

</head>

<body>

<%

String erroMessage = "";
String msg = request.getParameter("status");
if(msg!=null)
{
	if(msg.equalsIgnoreCase("error"))
	{
	erroMessage = "Registration failed, due to some issue with Server, please try after sometime.";
	}
	
}



%>


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
          
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <!-- Heading Row -->
        <div class="row">
          
 <center>
          <h3> Employee Management System v1.0</h3></br></br></br></br></br>
          
          <div class="col-lg-12">
                <div class="well text-center">
                 <h3>  Register yourself!</h3>
                </div>
            </div>
    
<form name="registrationForm" action="RegisterUserServlet"
onsubmit="return validateForm()" method="post">
<div class="col-lg-5">
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Username&nbsp</span>
  <input type="text" class="form-control" name="userName" placeholder="Enter the username" aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Password</span>
  <input type="password" class="form-control" name="password" placeholder="Enter the password" aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">E-Mail&nbsp&nbsp&nbsp&nbsp&nbsp</span>
  <input type="text" class="form-control" name="email" placeholder="Enter your e-mail"  aria-describedby="sizing-addon1">
</div></br>
<div class="input-group input-group-lg">
  <span class="input-group-addon" id="sizing-addon1">Country&nbsp&nbsp</span>
  <input type="text" class="form-control" name="country" placeholder="Enter your country" aria-describedby="sizing-addon1">
</div></br>

 <label class="col-xs-3 control-label">Gender</label>
        <div class="col-xs-5 selectContainer">
            <select name="gender" class="form-control">
                <option value="male">Male</option>
                <option value="female">Female</option>
            </select>
        </div>
 
<input class="btn btn-primary btn-lg" type ="submit" name="submit" value="Register" />  
</div>

</form>

<p><font color="red"><%=erroMessage %></font></p>
</center>
          
            <!-- /.col-md-8 -->
            <div class="col-md-4">
                
            </div>
            <!-- /.col-md-4 -->
        </div>
        <!-- /.row -->

        <hr>

 

    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>

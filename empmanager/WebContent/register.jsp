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

</head>

<body>
<script type="text/javascript">

function validateInput()
{
	var password = document.getElementById("password");
	alert(password);
	
	if(password.length > 8)
		{
		alert(" Password can not be more than 8 characters.");
		}
}



</script>
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
          
          <h5>Register Yourself!</h5>
         <form name="registerform" method="post" action="RegisterUserServlet" >
         User name:  <input type="text" placeholder="User Name" name="userName"/></br>
         </br>
         Password:  <input type="password" id ="password" name="password"/></br></br>
          E-Mail  <input type="text" name="email"/></br>
         </br>
          Country  <input type="text" name="country"/></br>
         </br>
         
        Gender: <select name="gender">
         <option value="male">Male</option>
         <option value="male">Femmale</option>
         </select>
         
         </br></br>
         <input type="submit" name ="submit" class="btn btn-primary btn-lg" value="Register" onclick="validateInput()"></br></br>
         </form>
           
         Not Registred?  <a href="register.jsp"> Click here</a>
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

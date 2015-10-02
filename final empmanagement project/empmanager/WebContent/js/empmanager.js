
function validateForm() {
    var username = document.forms["registrationForm"]["userName"].value;
    if (username == null || username == "") {
        alert("User Name must be filled out");
        document.forms["registrationForm"]["userName"].focus();
        
        return false;
    }
    
    
    var password = document.forms["registrationForm"]["password"].value;
    if (password == null || password == "") {
        alert("Password  must be filled out");
        document.forms["registrationForm"]["password"].focus();
        
        return false;
    }
    
    
    var email = document.forms["registrationForm"]["email"].value;
    var regularExp = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    var isValid =  regularExp.test(email);
    if(isValid==false)
    	{
    	 alert("Please enter a valid e-mail id.")
    	  document.forms["registrationForm"]["email"].focus();
    	 return false;
    	}

}

<%@include file="head.jsp"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="css/welcome.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
</head>
<body>
<ul>
    <li><a href="index.jsp">Home</a></li>
    <li><a href="#news">Portfolio</a></li>
    <li><a href="about.jsp">About</a></li>
    <li><a href="search_user.jsp">Login</a></li>
</ul>
    <div align="center" class="modal-dialog">
        <div class="loginmodal-container">

            <FORM ACTION="j_security_check" METHOD="POST" class="form-horizontal">
                   <INPUT TYPE="TEXT" NAME="j_username" placeholder="Username">
                   <INPUT TYPE="PASSWORD" NAME="j_password" placeholder="Password">
                   <INPUT TYPE="SUBMIT" VALUE="Log In" class="login loginmodal-submit">
            </FORM>
        </div>
    </div>


</body>
</html>

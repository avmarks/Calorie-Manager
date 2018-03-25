<%@include file="head.jsp"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>

    <div align="center" class="modal-dialog">
        <div class="loginmodal-container">
            <h1>Welcome Back</h1><br>
            <FORM ACTION="j_security_check" METHOD="POST" class="form-horizontal">
                   <INPUT TYPE="TEXT" NAME="j_username" placeholder="Username">
                   <INPUT TYPE="PASSWORD" NAME="j_password" placeholder="Password">
                   <INPUT TYPE="SUBMIT" VALUE="Log In" class="login loginmodal-submit">
            </FORM>
        </div></div></div>

</body>
</html>

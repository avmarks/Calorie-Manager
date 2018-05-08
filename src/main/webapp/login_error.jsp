<%@include file="head.jsp"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Login Failed</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div align="center" class="modal-dialog">
    <div class="loginmodal-container">
<!-- Tell the server to use form-based authentication. -->
        <h4>Your Login information was not correct. Please try again.</h4><br/>
       <p> <a href="${pageContext.request.contextPath}/login.jsp">Back to login page</a></p>
    </div>
</div>
</body>
</html>
<script>
    var timer = setTimeout(function() {
        window.location='login.jsp'
    }, 1800);
</script>
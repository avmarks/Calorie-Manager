<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 5/7/2018
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Error</title>
    <%@include file="head.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="css/welcome.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
</head>
<ul>
    <li><a href="index.jsp">Home</a></li>
    <li><a href="search_user.jsp">Login</a></li>
</ul>
<body>
<div class="jumbotron">
    <div class="container">
    <br/>
<h3>Looks like you got me with my pants down!</h3>
    <img src="images/SingleSleepyLeafcutterant-max-1mb.gif"><br/>
<h3 class="bg-danger">There was an error encountered <% out.print(response.getStatus()); %> </h3> <br/> <br/>
<p>You may be getting this error for the following reasons: </p>

    <div class="container">
    <p>The data that you are looking for may not be in database, try another search.</p>
    <p>User with the same username may already exist in database, try another name.</p>
    <p>Any guesses?</p>
        <p>admin@admin.com</p>
    <p>Please don't hesitate to contact me if the problem persists admin@admin.com</p>
    </div>
    <br/>
    <a class="btn btn-warning" href="login.jsp" role="button">Back to login page</a>
</div>
</div>
</body>
</html>

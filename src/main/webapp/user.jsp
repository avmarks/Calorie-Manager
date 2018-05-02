<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 4/25/2018
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="head.jsp"%>
<body>
<div class="container">
    <h2>${addMessage}</h2><br/>
<form action="addNewUser" method="post" class="form-horizontal">
    <div class="form-group">
        <label for="firstName" class="control-label col-sm-2">First Name: </label>
        <div class="col-sm-10">
            <input type="text" name="firstName" id="firstName" class="form-control"/><br />
        </div>
    </div>
    <div class="form-group">
        <label for="lastName" class="control-label col-sm-2">Last Name: </label>
        <div class="col-sm-10">
            <input type="text" name="lastName" id="lastName" class="form-control"/><br />
        </div>
    </div>
    <div class="form-group">
        <label for="userName" class="control-label col-sm-2">User Name: </label>
        <div class="col-sm-10">
            <input type="text" name="userName" id="userName" class="form-control"/><br />
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="control-label col-sm-2">Password: </label>
        <div class="col-sm-10">
            <input type="password" name="password" id="password" class="form-control"/><br />
        </div>
    </div>
    <div class="form-group pull-right">
     <input type="submit" class="btn btn-info" name="submit"/>
    </div>
</form>
    <h2>${loginMessage}</h2>
</div>
</body>
</html>

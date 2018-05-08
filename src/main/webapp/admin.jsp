<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 4/28/2018
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" type="text/javascript" charset="utf-8">
</script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<body class="bgimg">
<%@include file="navbar.jsp"%>
<div class="container">
<h4>${deleteMessage}</h4>
    <h4>${addMessage}</h4>
    <h4>${updateMessage}</h4>
<br/><br/>
    <table class="display" cellspacing="0" width="100%" id="dataTable">
        <thead>
            <th>User ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>User Name</th>
            <td>Role</td>
            <td>Action</td>
            <td>Action</td>
        </thead>
        <tbody>
<c:forEach var="user" items="${users}">
    <tr><form action="updateUser" method="post">
        <td>${user.id}<input type="hidden" value="${user.id}" id="userID" name="userID"></td>
        <td><input type="text" value="${user.firstName}" id="thisFName" name="thisFName"></td>
        <td><input type="text" value="${user.lastName}" id="thisLName" name="thisLName"></td>
        <td><input type="text" value="${user.userName}" id="thisUName" name="thisUName"></td>

        <td><c:forEach var="role" items="${user.userRoles}"><input type="text" value="${role.roleName}" name="thisURole"></c:forEach></td>
        <td >
            <a href="deleteUser?userID=${user.id}" value="userID" class="btn btn-danger" role="button">Delete</a>
        </td>
        <td>
            <!--<a href="updateUser?userID=${user.id}&thisFName=#thisFName&thisLName=#thisLName&thisUName=#thisUName" class="btn btn-warning" role="button">Update</a>-->
            <input type="submit"  class="btn btn-warning"  value="update">
        </td>
    </form>
    </tr>
    </tbody>
</c:forEach>
    </table><br/>
    <br/><br/> <button type="submit" class=" btn btn-success btn-lg" id="addNewUser">Add new user</button><br/><br/>

    <div class="addUser" id="addUser" >
        <%@include file="user.jsp" %>
    </div>

</div>
</body>
</html>
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#addUser').hide();

        $('#dataTable').DataTable();

        $('#addNewUser').on("click", function () {

            $('#addUser').show();
            $('#addNewUser').hide();
        })
    } );
</script>


<style>
    body,h1 {font-family: "Raleway", sans-serif}

    .navbar-inverse .navbar-brand {
        color: #5cb85c!important;
    }
    .navbar-nav:hover {
        color: #5cb85c;
    }

</style>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="head.jsp"%>

<body class="bgimg" >
<%@include file="navbar.jsp"%>

<div class="container">
    <h2>Search food: </h2>
    <form action="searchFood" class="form-inline">
        <div class="form-group">
        <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter Food Name">
    </div>
        <button type="submit" name="submit" value="search" class="btn btn-success">Search</button>
        <button type="submit" name="submit" value="searchAll" class="btn btn-success">Display All</button>
    </form><br/>

    <h2>Add Food to personal database:</h2>
    <%@include file="add_food.jsp" %>
</div>
</body>
</html>
<style>
    body,h1 {font-family: "Raleway", sans-serif}
    body, html {height: 100%}
    .bgimg {
        background: url('images/board_bread.jpg');
        min-height: 100%;
        background-position: center;
        background-size: cover;
    }
    .navbar-inverse .navbar-brand {
        color: #5cb85c!important;
    }
</style>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@include file="head.jsp"%>

<body>
<%@include file="navbar.jsp"%>

<div class="container">
    <h2>Search food: </h2>
    <form action="searchFood" class="form-inline">
        <div class="form-group">
            <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter Food Name">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
        <button type="submit" name="submit" value="searchAll" class="btn btn-primary">Display All</button>
    </form>
</div>
</body>
</html>

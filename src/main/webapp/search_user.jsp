<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>

<body>
<%@include file="navbar.jsp"%>
<%@ page session="false" %>

    <div class="container">
        <h2>Search users:</h2>
        <form action="searchUser" class="form-inline">
            <div class="form-group">
                <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">
            </div>
            <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
            <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
        </form>
    </div>
</body>
</html>
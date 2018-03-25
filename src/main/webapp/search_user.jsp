<%@include file="head.jsp"%>
<html>
<head>
    <title>Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>

<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Calorie Pal</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Page 2</a></li>
            <li><a href="#">Page 3</a></li>
        </ul>
    </div>
</nav>

    <div class="container">
        <h2>Search users:</h2>
        <form action="searchUser" class="form-inline">
            <div class="form-group">
                <label for="searchTerm">Search</label>
                <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter last name">
            </div>
            <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
            <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>
        </form>
    </div>
</body>
</html>
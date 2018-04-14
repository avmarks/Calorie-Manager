<%@include file="head.jsp"%>
<html>
<head>
    <title>Search Food</title>
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
            <li><a href="search_food.jsp">Search Food</a></li>
            <li><a href="add_food.jsp">Add Food Item</a></li>
            <li><a href="add_recipe.jsp">Add Recipe</a></li>
            <li><a href="recipe_history.jsp">Recipe History</a></li>
            <li><a href="logout.jsp">Logout</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <h2>Search food: </h2>
    <form action="searchFood" class="form-inline">
        <div class="form-group">
            <input type="text" class="form-control" id="searchTerm" name="searchTerm" aria-describedby="searchTermHelp" placeholder="Enter Food Name">
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
    </form>
</div>
</body>
</html>

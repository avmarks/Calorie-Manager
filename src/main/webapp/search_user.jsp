<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>

<body class="bgimg">
<%@include file="navbar.jsp"%>
<%@ page session="false" %>

    <div class="container">
        <h2>Post Calories</h2>
        <form action="#" class="form-inline">
            <div class="form-group">
                <input type="text" class="form-control" id="postCalories" name="postCalories" aria-describedby="postCaloriesHelp" placeholder="Enter calorie value">
            </div>
            <button type="submit" name="submit" value="Add" class="btn btn-success">Add</button>
           <!-- <button type="submit" name="submit" value="viewAll" class="btn btn-primary">View all users</button>-->
        </form>
        <br/>
        <br/>
        <div><button class="btn btn-warning" >Get Calories for last 30 days</button></div>
        <br/><br/>
        <img src="images/caloriesDashboard.PNG" alt="calories diagram">

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
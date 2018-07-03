<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>

<script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
<script type="text/javascript" src="js/chart/fusioncharts.theme.fint.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
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
        <div><button class="btn btn-warning">Get Calories for last 30 days</button></div>
        <br/><br/>
    </div>

<div id="chart-container"></div>
</body>

<script type="text/javascript">
    FusionCharts.ready(function() {
        var salesRevChart = new FusionCharts({
            "target": "chart",
            "type": "column2d",
            "renderAt": "sales-chart-container",
            "width": "500",
            "height": "300",
            "dataFormat": "json",
            "dataSource": {
                "chart": {
                    "caption": "Calories",
                    "subcaption": "Last 30 days",
                    "xaxisname": "Date",
                    "yaxisname": "Calories",
                    "numberprefix": "",
                    "showvalues": "0",
                    "theme": "fint"
                },
                "data": [{"label": "Bakersfield Central", "value": "880000"}, {
                    "label": "Garden Grooveharbour",
                    "value": "730000"
                },
                    {"label": "Los Angeles Topanga", "value": "590000"}, {
                        "label": "Compton-Rancho Dom",
                        "value": "520000"
                    },
                    {"label": "Daly City Serramonte", "value": "330000"}]
            }
        })
</script>
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
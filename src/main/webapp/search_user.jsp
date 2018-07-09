<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.6/css/mdb.min.css" />

<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.6/js/mdb.min.js"></script>
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
        <div><button class="btn btn-warning" onclick="getCalories()">Get Calories for last 30 days</button></div>
        <br/><br/>
        <canvas id="myChart" style="max-width: 500px;"></canvas>
    </div>


</body>

<script>

    function getCalories() {

        var person = $("#username").val();
        var currentTime = $(".")




    }




    function populateCalorieChart(data) {
        var ctx = document.getElementById("myChart").getContext('2d');

        var allXValues = [];
        $.each(data, function (index, value) {
            allXValues.push(value.x)
        });

        var allYValues = [];
        $.each(data, function (index,value) {
            allYValues.push(value.y)
        })

        var myChart = new Chart(ctx, {
            type: 'bar',
            data: {
                labels: allXValues,
                datasets: [{
                    label: '# of Calories',
                    data: allYValues,
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)',
                        'rgba(153, 102, 255, 0.2)',
                        'rgba(255, 159, 64, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)',
                        'rgba(153, 102, 255, 1)',
                        'rgba(255, 159, 64, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    yAxes: [{
                        time: {
                            unit:"day"
                        }
                    }]
                }
            }
        });

        $.getJSON("DateCalories/json", function(data) {

        })

    }

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
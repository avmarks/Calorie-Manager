<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 4/12/2018
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="head.jsp"%>

<body class="bgimg">
<%@include file="navbar.jsp"%>
<%@ page session="false" %>

<div class="container">
    <h2>Add Ingredient to Recipe</h2><br/><br/>

    <form class="form-inline">

        <div class="form-group">
            <input type="text" class="form-control"
                    placeholder="Enter Recipe Name " >
        </div>


    </form><br/>
 <form action="searchRecipeAPI" class="form-inline">

        <div class="form-group">
            <input type="text" class="form-control" id="searchMessage" name="searchMessage"
                   aria-describedby="searchMessage" placeholder="Enter food name and grams here" >
        </div>
        <button type="submit" name="submit" class="btn btn-success" id="addRecipe">Add</button>

    </form>

    <br/>


    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Food</th>
            <th scope="col">Grams</th>
            <th scope="col">Calories</th>
            <th scope="col">Image</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">${foodName}</th>
            <td>${foodServing}</td>
            <td>${foodCalories}</td>
            <td><img src=${foodPhoto} /></td>
        </tr>
         </tbody>
    </table>

    <table id="myTable">

    </table>
</div>

</body>
</html>


<%--<script>

$(document).ready(function () {

    $('#addRecipe').on("click", function () {
        document.forms.action = "searchRecipeAPI";
        //document.forms[0].submit();
        var foodName = '${foodName}'
        var foodCalories = '${foodCalories}'
        var foodServing = '${foodServing}'
        var foodImage = '${foodPhoto}'

         $('#myTable').append('<tr><td>' + foodName +'</td><td>' + foodServing +'</td><td>' +foodCalories + '</td><td><img src=' + foodImage + '/></td></tr>');


    });
});
</script>--%>

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

    .table, th, td, tr {
        border: 1px solid #080808 ;
    }
</style>
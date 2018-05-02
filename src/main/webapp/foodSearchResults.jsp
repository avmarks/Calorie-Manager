<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="taglib.jsp" />
<html>
<jsp:include page="head.jsp" />
<c:set var="title" value="Search Results" />
<body class="bgimg">
<%@include file="navbar.jsp"%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="calculating" class="display" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th>Food Name</th>
            <th>Calories</th>
            <th>Weight</th>
        </tr>
        </thead>
        <tbody >
            <tr>
                <td>${foodName}</td>
                <td>${foodCalorie}</td>
                <td><input id="calculate" placeholder=" quick calculation"></td>
            </tr>
        </tbody>
    </table>

    <table id="userTable">

        <thead>
            <tr>
                <th id="foodNameId">Food Name</th>
                <th id="foodCalorieId">Calories</th>
            </tr>
        </thead>
        <c:forEach var="foodItem" items="${foods}">
        <tbody>
            <tr>

                    <td>${foodItem.foodName}</td>
                    <td>${foodItem.foodCalories}</td>
            </tr>
        </tbody>
        </c:forEach>
    </table>
</div>
</body>
</html>

<script type="text/javascript">
    $('#userTable').each(function () {
        if ( $(this).find('td').length < 1 || $(this).find('td').is(':empty') ) {
            $(this).hide();
            $('#foodNameId').hide();
            $('#foodCalorieId').hide();
        } else {
            $("#userTable").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true
            });
            $("#calculating").hide();
        }
        });
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
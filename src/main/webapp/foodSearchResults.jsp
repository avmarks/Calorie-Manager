<%@include file="taglib.jsp"%>
<c:set var="title" value="Search Results" />
<%@include file="head.jsp"%>


<html>
<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Food Name</th>
        <th>Food Calories</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td> <c:forEach var="food" items="${user.foodSet}">
                    ${food.calories} ${food.foodName} <br></c:forEach></td>

                <td>
                <c:forEach var="food" items="${user.foodSet}">
                    ${food.id} ${food.foodName} <br></c:forEach></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
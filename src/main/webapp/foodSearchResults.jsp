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

        </thead>
        <tbody>
        <tr>
        <c:forEach var="thisFood" items="${foods}">



                      <td> ${thisFood.id} ${thisFood.foodCalories} ${thisFood.foodName}<br></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
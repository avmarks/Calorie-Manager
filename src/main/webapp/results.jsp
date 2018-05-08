<%--NOT Part of the project  needs to be in legacy here, just in case
<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>
<c:set var="title" value="Search Results" />
<body>
<%@include file="navbar.jsp"%>
<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <th>Name</th>
        <th>User Name</th>
        <th>Food</th>
        </thead>
        <tbody>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.firstName} ${user.lastName}</td>
                <td>${user.userName}</td>
                <td>
                <c:forEach var="food" items="${user.foodSet}">
                    ${food.id} ${food.foodName} <br></c:forEach></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>

<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('#userTable').DataTable();
    } );
</script>--%>

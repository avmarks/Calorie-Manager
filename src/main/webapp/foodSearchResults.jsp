<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" value="Search Results" />
<html>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#userTable").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true
            });
        });
    </script>




<body>

<div class="container-fluid">
    <h2>Search Results: </h2>
    <table id="userTable" class="display" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th>User</th>
            <th>Food Name</th>
            <th>Calories</th>
            <th>Weight</th>
        </tr>
        </thead>
        <tbody>
            <tr>

                <c:forEach var="thisFood" items="${foods}">
                    <td>*</td>
                    <td>${thisFood.foodName}</td>
                    <td>${thisFood.foodCalories}</td>
                    <td>"*"</td>
                </c:forEach>
            </tr>

        </tbody>
    </table>
</div>
</body>
</html>
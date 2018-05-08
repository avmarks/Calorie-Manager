<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 5/8/2018
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${Message}</h3>
</body>
</html>
<script>
    var timer = setTimeout(function() {
        window.location='search_food.jsp'
    }, 150);
</script>
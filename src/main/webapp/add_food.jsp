<%@include file="taglib.jsp"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<%@include file="head.jsp"%>
<c:set var="title" value="Add Food" />
<body>
<div class="container">
<h2>${Message}</h2>
    <form action="addFood" method="post" class="form-horizontal">
        <input type="text" name="foodName" id="foodName" placeholder="enter food name"/><br/>
        <input type="number" name="foodCalorie" id="foodCalorie" placeholder="enter calorie for 1 gram of food"/><br/>
        <input type="submit" name="submit"/>

    </form>
</div>
</body>
</html>

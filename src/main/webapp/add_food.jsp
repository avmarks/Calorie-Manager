<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>
<c:set var="title" value="Add Food" />
<body>
<%@include file="navbar.jsp"%>
<div class="container">
<h2>${Message}</h2>
    <form action="addFood" method="post" class="form-horizontal">
        <input type="text" name="foodName" id="foodName" placeholder="enter food name"/><br/><br/>
        <input type="number" name="foodCalorie" id="foodCalorie" class="col-lg-5" placeholder="enter calorie for 100 gram of food"/><br/><br/>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Add Food</button>
    </form>
</div>
</body>
</html>

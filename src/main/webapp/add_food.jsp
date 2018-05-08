<%@include file="taglib.jsp"%>
<html>
<%@include file="head.jsp"%>
<c:set var="title" value="Add Food" />
<body>
<div>
<h2>${Message}</h2>
    <form action="addFood" method="post" class="form-inline">
        <div class="form-group">
            <input type="text" name="foodName" class="form-control" id="foodName" placeholder="enter food name"/><br/>
        </div>
        <div class="form-group">
            <input type="number" name="foodCalorie" class="form-control" id="foodCalorie"  placeholder="enter calorie/100 gr"/><br/>
        </div>
        <button type="submit" name="submit" value="search" class="btn btn-warning">Add Food</button>
    </form>
</div>
</body>
</html>

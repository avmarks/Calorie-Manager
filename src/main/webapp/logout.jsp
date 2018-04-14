<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 4/12/2018
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="true"%>
<h3>User '<%=request.getRemoteUser()%>' has been logged out.</h3>

<br/><br/>
<%--This is a function to redirect the user to the index page once user logs out  --%>
<script>
    var timer = setTimeout(function() {
        window.location='index.jsp'
    }, 2000);
</script>
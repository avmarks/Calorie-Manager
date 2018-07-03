<%--
  Created by IntelliJ IDEA.
  User: avrma
  Date: 6/13/2018
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/welcome.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Roboto'>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<ul>
    <li><a href="index.jsp">Home</a></li>
    <li><a href="portfolio.jsp">Portfolio</a></li>
    <li><a href="about.jsp">About</a></li>
    <li><a href="search_user.jsp">Login</a></li>
</ul>
<div class="container">
<div class="">
   <h2> Portfolio of web applications</h2><br/>
</div>
    <div class="card-deck">
    <div class="card border-success mb-3" style="width: 30rem;">
        <img class="card-img-top" src="images/PProducts.PNG" alt="plumbing web page photo">
        <div class="card-body">
            <p class="card-text">
                This application helps wisconsinites to find information
                about registered and approved plumbing manufacturers, their products and contaminants.
            </p>
            <a href="https://verification.dsps.wi.gov/Industry-Service-Searches/PlumbingManufacturers" class="btn btn-success">Visit the page</a>
        </div>
        <div class="card-footer">
            <small class="text-muted">
                <h6>Specifications:</h6>
                <p> Backend: C#, MVC. Frontend: Bootstrap, Custom CSS. Database: LINQ querying of xml.</p>
            </small>
        </div>
    </div>
        <div class="card border-danger mb-3" style="width: 30rem;">
            <img class="card-img-top" src="images/SBInspectors.PNG" alt="plumbing web page photo">
            <div class="card-body">
                <p class="card-text">
                    This application helps wisconsinites to find information
                    about safety and building inspectors.
                </p>
                <a href="https://verification.dsps.wi.gov/Industry-Service-Searches/SBISearch" class="btn btn-success">Visit the page</a>
            </div>
            <div class="card-footer">
                <small class="text-muted">
                    <h6>Specifications:</h6>
                    <p> Backend: C#, MVC. Frontend: Bootstrap, Custom CSS. Database: PL/SQL querying Oracle DB</p>
                </small>
            </div>
        </div>
        <div class="card border-warning mb-3" style="width: 30rem;">
            <img class="card-img-top" src="images/PProducts.PNG" alt="plumbing web page photo">
            <div class="card-body">
                <p class="card-text">
                    This application helps wisconsinites to find information
                    about registered and approved plumbing manufacturers, their products and contaminants.
                </p>
                <a href="https://verification.dsps.wi.gov/Industry-Service-Searches/PlumbingManufacturers" class="btn btn-success">Visit the page</a>
            </div>
            <div class="card-footer">
                <small class="text-muted">
                    <h6>Specifications:</h6>
                    <p> Backend: C#, MVC. Frontend: Bootstrap, Custom CSS. Database: PL/SQL querying Oracle DB</p>
                </small>
            </div>
        </div>
        <div class="card border-info mb-3" style="width: 30rem;">
            <img class="card-img-top" src="images/manufacturersOfApprovedBP.PNG" alt="plumbing web page photo">
            <div class="card-body">
                <p class="card-text">
                    This application helps wisconsinites to find information
                    about manufacturers of approved building products.
                </p>
                <a href="https://verification.dsps.wi.gov/Industry-Service-Searches/SBManufacturers" class="btn btn-success">Visit the page</a>
            </div>
            <div class="card-footer">
                <small class="text-muted">
                    <h6>Specifications:</h6>
                    <p> Backend: C#, MVC. Frontend: Bootstrap, Custom CSS. Database: PL/SQL querying Oracle DB</p>
                </small>
            </div>
        </div>
        <div class="card border-info mb-3 z-depth-4 rounded" style="width: 30rem;">
            <img class="card-img-top" src="images/ERSCourseProviders.PNG" alt="plumbing web page photo">
            <div class="card-body">
                <p class="card-text">
                    This application helps wisconsinites to find information
                    about course providers for safety inspectors.
                </p>
                <a href="https://verification.dsps.wi.gov/Industry-Service-Searches/" class="btn btn-success">Visit the page</a>
            </div>
            <div class="card-footer">
                <small class="text-muted">
                    <h6>Specifications:</h6>
                    <p> Backend: C#, MVC. Frontend: Bootstrap, Custom CSS. Database: PL/SQL querying Oracle DB</p>
                </small>
            </div>
        </div>
    </div>
</div>
</body>
</html>

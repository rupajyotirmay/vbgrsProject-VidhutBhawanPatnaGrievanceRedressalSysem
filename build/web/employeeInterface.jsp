<%-- 
    Document   : cviewprofile
    Created on : 22 Nov, 2021, 8:35:18 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"  %>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>ElectricityBillingSystem</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <style>
body {  background-color:lightblue;}
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: gray;
   color: white;
   text-align: center;
   font-size: 16px;
}

</style>
</head>
<body>
    
<div class="container">
	<nav  class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
		<h2><a class="navbarbrand"href="#">Electricity Billing System</a></h2>
		</div>
	<ul class="nav navbar-nav navbar-right">
	<li><a href=""><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
	</ul>
	
	</div>
	</nav> 
</div>
    
    <div class="container">
        
    <h1>EMPLOYEE PAGE</h1>
        <div class="row">
            <div class="col-sm-12">
                
                <h2>Consumer Details</h2>
                <a href="addconsumer.html"><button type="button" class="btn btn-success">Insert</button></a>
                <a href="conadminview.jsp"><button type="button" class="btn btn-info">View All</button></a>
                <a href="addemp.html"><button type="button" class="btn btn-warning">Update</button></a>
                <a href="addemp.html"><button type="button" class="btn btn-danger">Delete</button></a>

            </div>
            <div class="col-sm-12">
                
                
                <h3>feedback Details</h3>
                <a href="feedbackview.jsp"><button type="button" class="btn btn-success">View All Feedback</button></a>
            </div>
        </div>
    </div>
  
<div class="footer">
    <p>Designed & Developed by : Group no - 2  Session (2020-2022) Under Project Guide:<b> Asst.Professor Ms.Sushmita Chakraborty</b>
            (Department of M.C.A., Patna Women's College, Patna)</p>
</div>
</body>
</html>

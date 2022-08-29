<%-- 
    Document   : empadminview
    Created on : 14 Dec, 2021, 8:18:27 PM
    Author     : Dell
--%>

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
		<h2><a class="navbarbrand"href="index.html">Electricity Billing System</a></h2>
		</div>
	<ul class="nav navbar-nav">
	<li ><a href="index.html">About</a></li>
	<li class="dropdown" "active">
	<a class="dropdown-toggle"data-toggle="dropdown"href="#">Bill<span class="caret"></span></a>
		<ul class="dropdown-menu"> 
		<li><a href="BillPay.html">Payment</a></li>
		<li><a href="#">Receipt</a></li>
		<li><a href="#">Bill View</a></li>
		</ul>
	</li>
	<li><a href="contact.html">Contact</a></li>
	</ul>
	<ul class="nav navbar-nav navbar-right">
	<li><a href="adminview.jsp"><span class="glyphicon glyphicon-log-in"></span>Go Back</a></li>
	</ul>
	</div>
	</nav> 
</div>
    
    <div class="container">     
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Designation</th>
        <th>Phone</th>
        <th>Plot</th>
        <th>City</th>
        <th>State</th>
        
      </tr>
    </thead>
    <tbody>
        <%
             String cid=request.getParameter("cid");
    try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
            
            PreparedStatement ps=con.prepareStatement("select * from emptbl");
                     ResultSet rs = ps.executeQuery(); 
           
                    while(rs.next())
            {
                %>
<tr>
    <td><%out.println(rs.getString(1));%></td><td><%out.println(rs.getString(2));%></td><td><%out.println(rs.getString(5));%></td><td><%out.println(rs.getString(4));%></td>
    <td><%out.println(rs.getString(6));%></td><td><%out.println(rs.getString(7));%></td><td><%out.println(rs.getString(8));%></td>
    
</tr>         
                <%
            }
        }    
    catch(Exception ex)
            {
            out.println(ex.toString());
            }

%>
         
    </tbody>
  </table>
</div>

<div class="footer">
    <p>Designed & Developed by : Group no - 2  Session (2020-2022) Under Project Guide:<b> Asst.Professor Ms.Sushmita Chakraborty</b>
            (Department of M.C.A., Patna Women's College, Patna)</p>
</div>
</body>
</html>

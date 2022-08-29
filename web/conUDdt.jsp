<%-- 
    Document   : conUDdt
    Created on : 24 Feb, 2022, 8:33:01 AM
    Author     : Dell
--%>

<%-- 
    Document   : update  Consumer
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

    
<div class="container">
	<nav  class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
		<h2><a class="navbarbrand"href="#">Electricity Billing System</a></h2>
		</div>
	<ul class="nav navbar-nav navbar-right">
	<li><a href="index.html"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
	</ul>
	
	</div>
	</nav> 
</div>
   
    
    <%             String cid=request.getParameter("cid");
    try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
                PreparedStatement ps=con.prepareStatement("select * from consumertb where cid=?");
                ps.setString(1,cid);
               String conid=request.getParameter("cid");
                       request.setAttribute("conid","cid");
                ResultSet rs = ps.executeQuery(); 
                while(rs.next()){
 %>
    
            <div class="container">
         <h1>Consumer Details</h1>
         <form action="./comupdt" method="post"> 
               <div class="row">
                    <div class="col-sm-4">
                        <label >Consumer ID</label>
                    </div>
                    <div class="col-sm-4">
                        <%out.println(rs.getString(1));
                        %>
                    </div>
                </div>  
                <div class="row">
                    <div class="col-sm-4">
                        <label for="Name">Consumer Name:</label>
                    </div>
                    <div class="col-sm-4"><%out.println(rs.getString(2));%>
                    </div>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="nm" placeholder="Enter Consumer Name" name="nm">
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4">
                        <label for="Consumer phone no">Co Phone no:</label>
                    </div>
                    <div class="col-sm-4"><%out.println(rs.getString(3));%>
                    </div>
                    <div class="col-sm-4">
                        <input class="form-control"type="text" id="phone" name="phone"placeholder="Enter Your Phone no">
                </div>
                </div>
                <div class="row">
                    <div class="col-sm-4">
                        <label for="customer type">Consumer Type:</label>
                    </div>
                    <div class="col-sm-4"><%out.println(rs.getString(4));%>
                    </div>
                    <div class="col-sm-4">
                        <select class="form-control"name="type">
                        <option value="0">Select Consumer Type:</option>
                        <option value="1">200</option>
                        <option value="2">440</option> 
                        </select>    
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-4">
                         <label for="customer plot no">Consumer Plot no:</label></div>
                    <div class="col-sm-4"><%out.println(rs.getString(6));%>
                    </div>
                     <div class="col-sm-4">
                     <input class="form-control"type="text" id="plot no" name="plotno"placeholder="Enter Your  Plot no">
                     </div>
                </div>
                <div class="row">
                    <div class="col-sm-4">
                        <label for="customer city">Consumer City:</label></div>
                    <div class="col-sm-4"><%out.println(rs.getString(7));%>
                    </div>
                    <div class="col-sm-4">
                       <input class="form-control"type="text" id="city" name="city"placeholder="Enter Your City">
                    </div>
                </div>
                <div class="row">
                  <div class="col-sm-4">
                    <label for="customer state">Consumer State:</label>
                  </div>
                  <div class="col-sm-4"><%out.println(rs.getString(8));%>
                  </div>
                  <div class="col-sm-4">
                           <select class="form-control" id="state" name="state"placeholder="Select Enter Your  State"> <option value="Andhra Pradesh">Andhra Pradesh</option>
                            <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                            <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                            <option value="Assam">Assam</option>
                            <option value="Bihar">Bihar</option>
                            <option value="Chandigarh">Chandigarh</option>
                            <option value="Chhattisgarh">Chhattisgarh</option>
                            <option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
                            <option value="Daman and Diu">Daman and Diu</option>
                            <option value="Delhi">Delhi</option>
                            <option value="Lakshadweep">Lakshadweep</option>
                            <option value="Puducherry">Puducherry</option>
                            <option value="Goa">Goa</option>
                            <option value="Gujarat">Gujarat</option>
                            <option value="Haryana">Haryana</option>
                            <option value="Himachal Pradesh">Himachal Pradesh</option>
                            <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                            <option value="Jharkhand">Jharkhand</option>
                            <option value="Karnataka">Karnataka</option>
                            <option value="Kerala">Kerala</option>
                            <option value="Madhya Pradesh">Madhya Pradesh</option>
                            <option value="Maharashtra">Maharashtra</option>
                            <option value="Manipur">Manipur</option>
                            <option value="Meghalaya">Meghalaya</option>
                            <option value="Mizoram">Mizoram</option>
                            <option value="Nagaland">Nagaland</option>
                            <option value="Odisha">Odisha</option>
                            <option value="Punjab">Punjab</option>
                            <option value="Rajasthan">Rajasthan</option>
                            <option value="Sikkim">Sikkim</option>
                            <option value="Tamil Nadu">Tamil Nadu</option>
                            <option value="Telangana">Telangana</option>
                            <option value="Tripura">Tripura</option>
                            <option value="Uttar Pradesh">Uttar Pradesh</option>
                            <option value="Uttarakhand">Uttarakhand</option>
                            <option value="West Bengal">West Bengal</option>
                           </select>
                  </div>
                </div>
                   <button type="submit" class="btn btn-default">Submit</button>
  </form>
            </div>
  <%
                         break;
            }

        }    
    catch(Exception ex)
            {
            out.println(ex.toString());
            }

%>


<div class="footer">
    <p>Designed & Developed by : Group no - 2  Session (2020-2022) Under Project Guide:<b> Asst.Professor Ms.Sushmita Chakraborty</b>
            (Department of M.C.A., Patna Women's College, Patna)</p>
</div>

</html>


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class viewprofile extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nm=request.getParameter("cid");
            HttpSession session=request.getSession();
            String cid=session.getAttribute("cid").toString();
            try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
            
            PreparedStatement ps=con.prepareStatement("select * from consumertb where cid=? ");
            ps.setString(1,cid);            
            
            ResultSet rs = ps.executeQuery(); 
            if(rs.next())
            {
                out.println("<html> <head>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"         <title>ElectricityBillingSystem1</title>\n" +
"  <meta charset=\"utf-8\">\n" +
"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n" +
"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n" +
"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n" +
"  \n" +
"  <style>\n" +
"body {  background-color:lightblue;}\n" +
".footer {\n" +
"   position: fixed;\n" +
"   left: 0;\n" +
"   bottom: 0;\n" +
"   width: 100%;\n" +
"   background-color: gray;\n" +
"   color: white;\n" +
"   text-align: center;\n" +
"   font-size: 16px;\n" +
"}\n" +
"\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"    \n" +
"<div class=\"container\">\n" +
"	<nav  class=\"navbar navbar-default\">\n" +
"	<div class=\"container-fluid\">\n" +
"		<div class=\"navbar-header\">\n" +
"		<h2><a class=\"navbarbrand\"href=\"#\">Electricity Billing System</a></h2>\n" +
"		</div>\n" +
"	<ul class=\"nav navbar-nav\">\n" +
"	<li ><a href=\"#\">About</a></li>\n" +
"	<li class=\"dropdown\" \"active\">\n" +
"	<a class=\"dropdown-toggle\"data-toggle=\"dropdown\"href=\"#\">Bill<span class=\"caret\"></span></a>\n" +
"		<ul class=\"dropdown-menu\"> \n" +
"		<li><a href=\"#\">Payment</a></li>\n" +
"		<li><a href=\"#\">Recipt</a></li>\n" +
"		<li><a href=\"#\">Bill View</a></li>\n" +
"		</ul>\n" +
"	</li>\n" +
"	<li><a  href=\"emp.html\">Employee</a></li>\n" +
"	<li><a  href=\"customerAdd.html\">Customer</a></li>\n" +
"	<li><a href=\"#\">Feedback</a></li>\n" +
"	<li><a href=\"contact.html\">Contact</a></li>\n" +
"	</ul>\n" +
"	<ul class=\"nav navbar-nav navbar-right\">\n" +
"	<li><a href=\"\"><span class=\"glyphicon glyphicon-log-in\"></span>Login</a></li>\n" +
"	</ul>\n" +
"	</div>\n" +
"	</nav> \n" +
"</div>\n" +
"    \n" +
"    <div class=\"container\">\n" +
"  <h2>Bordered Table</h2>\n" +
"  <p>The .table-bordered class adds borders to a table:</p>            \n" +
"  <table class=\"table table-bordered\">\n" +
"    <thead>\n" +
"      <tr>\n" +
"        <th>Name</th>\n" +
"        <th>Phone</th>\n" +
"        <th>Load</th>\n" +
"        <th>Plot</th>\n" +
"        <th>City</th>\n" +
"        <th>State</th>\n" +
"      </tr>\n" +
"    </thead>\n" +
"    <tbody>      \n" +
"\n" +
"<tr>\n" +
"    <td>"+ rs.getString(2)+" </td>   <td>"+ rs.getString(3)+" </td>   <td>"+ rs.getString(5)+
" </td>   <td>"+ rs.getString(6)+" </td>   <td>"+ rs.getString(7)+" </td>   <td>"+ rs.getString(8)+
"</tr>\n" +
"    </tbody>\n" +
"  </table>\n" +
"</div>\n" +
"\n" +
"<div class=\"footer\">\n" +
"    <p>Designed & Developed by : Group no - 2  Session (2020-2022) Under Project Guide:<b> Asst.Professor Ms.Sushmita Chakraborty</b>\n" +
"            (Department of M.C.A., Patna Women's College, Patna)</p>\n" +
"</div>\n" +
"</body>\n" +
"</html>");
            }
            
            }
            catch(Exception ex)
            {
            out.println(ex.toString());
            }
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

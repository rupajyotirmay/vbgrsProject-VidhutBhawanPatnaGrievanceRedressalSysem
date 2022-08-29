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
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class addconsumer extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nm=request.getParameter("nm");
            String phone=request.getParameter("phone");
            String load=request.getParameter("load");
            String plot=request.getParameter("plotno");
            String ct=request.getParameter("city");
            String state=request.getParameter("state");
            String email=request.getParameter("email");            
            try{            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
            PreparedStatement ps=con.prepareStatement("insert into consumertb(nm,phone,load,plot,city,cstate,email) values(?,?,?,?,?,?,?)");
            ps.setString(1,nm);
            ps.setString(2,phone);
            ps.setString(3,load);
            ps.setString(4,plot);
            ps.setString(5,ct);
            ps.setString(6,state);
            ps.setString(7,email);
            ps.executeUpdate();  
            out.println("Record Saved  Successfully");
            con.close();
            Connection con1=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
          
           Statement ps1=con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = ps1.executeQuery("SELECT * FROM CONSUMERTB ");
            
                         rs.afterLast();
                  while(rs.previous()) {
                      
                    out.println("<html><head></head>"
                    + "<body>"
                    + "Your Consumer id is---"+rs.getString("id")+" <a href='adminview.jsp'> Go Back</a>"
                    + "</body></html>");
                      String to = rs.getString("email");
                        String subject = " Keep Confiedential Your Consumer ID --";
                        String message =   rs.getString("id");
                        String user = "rupatry1@gmail.com";
                        String pass = "Un!0n8jan";
                        SendMail.send(to,subject, message, user, pass);
                        out.println("Your Consumer id has been send to your Registered EMail successfully");
                        
                     break;
                  }           }
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

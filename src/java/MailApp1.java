///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//import java.sql.*;
//
///**
// *
// * @author Dell
// */
//public class MailApp1 extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        
//        try{
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
//            
//            PreparedStatement ps=con.prepareStatement("select * from consumertb ");
//                     ResultSet rs = ps.executeQuery(); 
//           
//                    while(rs.next())
//            {
//               String to = String.valueOf(rs.getString(10));
//        String subject = " Keep Confiedential Your Consumer ID --";
//        String message =  String.valueOf(rs.getString(1));
//        String user = "rupatry1@gmail.com";
//        String pass = "Un!0n8jan";
//        SendMail.send(to,subject, message, user, pass);
//        out.println("Mail send successfully");
//            }
//        }    
//    catch(Exception ex)
//            {
//            out.println(ex.toString());
//            }
//        
//        
//        
//        
//    }   
//}
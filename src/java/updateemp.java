//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class updateemp extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            String eid=request.getParameter("eid");
//            String nm=request.getParameter("nm");
//            String phone=request.getParameter("phone");
//            String type=request.getParameter("type");   
//            String plot=request.getParameter("plotno");
//            String ct=request.getParameter("city");
//            String state=request.getParameter("state");      
//            try{            
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/elebillsys ","ems","ems");
//            PreparedStatement ps=con.prepareStatement("update emptbl set enm=?,phone=?,edesig=?,plot=?,city=?,estate=?, where eid=?");
//            ps.setString(1,nm);                             "UPDATE book SET title = ?, author = ?, price = ?";
//        sql += " WHERE book_id = ?"
//            ps.setString(2,phone);
//            ps.setString(3,type);
//            ps.setString(4,plot);
//            ps.setString(5,ct);
//            ps.setString(6,state);           
//            ps.executeUpdate();
//            out.println("Record Updated Successfully ."+"<html><head></head>"
//                    + "<body>"
//                    + "<br>"
//                    + "<a href='adminview.jsp'> Go Back</a><br>"
//                    
//                    + "</body></html>");
//            }
//            catch(Exception ex)
//            {
//            out.println(ex.toString());
//            }
//        }    
//    }
//
//// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}

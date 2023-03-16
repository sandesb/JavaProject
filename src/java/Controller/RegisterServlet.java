/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Hashing.HashingPassword;
import Model.login;
import javax.servlet.RequestDispatcher;
import Service.UserServices;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
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
        
        doPost(request, response);
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
        
        String page = request.getParameter("page");
        
        if(page.equalsIgnoreCase("existing")) {
            
            String username = request.getParameter("username");
            String password = HashingPassword.hashPassword(request.getParameter("password"));
            
            System.out.println(username + " " + password + " ");

            login user = new UserServices().getUser(username, password);
            System.out.println(user.getUserName()+" "+user.getPassword());
            
            if (user != null) {
                
                HttpSession session = request.getSession();
                session.setAttribute("uid", user.getId());
                session.setAttribute("fullName", user.getfullName());
                session.setAttribute("user", user);
                //System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
                
                 response.sendRedirect("Pages/dashboard.jsp");
                
//                RequestDispatcher rd = request.getRequestDispatcher("Pages/dashboard.jsp");
//                rd.forward(request, response);
                
            } else {
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("Pages/login.jsp");
                rd.forward(request, response);
            } 
        } // --------- existing page ends here --------- 
        
         if (page.equalsIgnoreCase("newUser")) {
            login user = new login();
            user.setfullName(request.getParameter("fname") + " " + request.getParameter("lname"));
            user.setUsername(request.getParameter("username"));
            user.setPassword(HashingPassword.hashPassword(request.getParameter("password")));
            new UserServices().insertUser(user);
            RequestDispatcher rd = request.getRequestDispatcher("/Pages/login.jsp");
            rd.forward(request, response);
        }
        
        if ( page.equalsIgnoreCase("register") ) {
                                
                RequestDispatcher rd = request.getRequestDispatcher("/Pages/register.jsp");
                rd.forward(request, response);
                
            } 
        if ( page.equalsIgnoreCase("login") ) {
                                
                RequestDispatcher rd = request.getRequestDispatcher("/Pages/login.jsp");
                rd.forward(request, response);
                
            } 
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

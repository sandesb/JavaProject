/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Hashing.HashingPassword;
import Model.login;
import Model.signup;
import Model.video;
import Service.UserServices;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author home
 */
public class LoginServ extends HttpServlet {

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
        System.out.println("\n\n HELLO");
        
        if(page.equalsIgnoreCase("existing")) {
            String email = request.getParameter("username");
            System.out.println("in here");
            String password = HashingPassword.hashPassword(request.getParameter("password")); 
            System.out.println("\n\n------Password----");
            System.out.println(password);
            System.out.println(email + " " + password + " ");
            
            signup user = new UserServices().getUser(email, password);
            
            if (user != null) {
                
                HttpSession session = request.getSession();
                session.setAttribute("uid", user.getId());
                session.setAttribute("email", user.getFullname());
                //System.out.println(session.getAttribute("user"));
                request.setAttribute("msg", "Login Successful!");
                System.out.println(request.getAttribute("msg"));
//                
//                 response.sendRedirect("index.jsp");
//                    s.setAttribute("username", uname);
                
                response.sendRedirect("index.jsp?email='"+email+"'");
//                RequestDispatcher rd = request.getRequestDispatcher("Pages/dashboard.jsp");
//                rd.forward(request, response);
                
            } else {
                System.out.println("wwq");
                request.setAttribute("msg", "Invalid username or password");
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
            } 
        } // --------- existing page ends here --------- 
        
         if (page.equalsIgnoreCase("newUser")) {
            login user = new login();
            user.setFullName(request.getParameter("username"));
            user.setPassword(HashingPassword.hashPassword(request.getParameter("password")));
            new UserServices().insertUser(user);
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
          if (page.equalsIgnoreCase("signUp")) {
            /*signup is from UserServices but sign is the instance*/
            signup sign = new signup();
            sign.setFullname(request.getParameter("fullname"));
            sign.setEmail(request.getParameter("email"));
            sign.setPassword(HashingPassword.hashPassword(request.getParameter("password")));
            new UserServices().insertUser(sign);
            RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
        }      
          // --------- signUp ends here --------- 
          if (page.equalsIgnoreCase("editUser")) {
            /*signup is from UserServices but sign is the instance*/
            signup sign = new signup();
            sign.setFullname(request.getParameter("fullname"));
            sign.setPassword(HashingPassword.hashPassword(request.getParameter("password")));
//                              int id is from UserServices, and mathikai instance
            new UserServices().editUser(request.getParameter("id"),sign);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
        } 
//          Cookie servlet
          if (page.equalsIgnoreCase("fav")) {
            Cookie cookie = new Cookie("favmovie",request.getParameter("fav"));
            response.addCookie(cookie);
            
            
            RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
            rd.forward(request, response);
        }
        //upload try
        if (page.equalsIgnoreCase("video")) {
            /*signup is from UserServices but sign is the instance*/
            video video = new video();
//                              yeta Model ma bhako name halne request garna agadi
            video.setMovie_desc(request.getParameter("desc"));
            video.setThumbnail(request.getParameter("thumb"));
            video.setVideo(request.getParameter("image"));
           new UserServices().insertUser(video);
            RequestDispatcher rd = request.getRequestDispatcher("image.jsp");
            rd.forward(request, response);
        }  
        
        if ( page.equalsIgnoreCase("register") ) {
                                
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
                
            } 
        if ( page.equalsIgnoreCase("login") ) {
                                
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                
            } 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

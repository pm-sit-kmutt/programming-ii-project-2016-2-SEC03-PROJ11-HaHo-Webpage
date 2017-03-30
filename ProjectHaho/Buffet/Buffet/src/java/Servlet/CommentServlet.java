/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Comment;
import Model.Tread;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author Administrator
 */
public class CommentServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String tt= request.getParameter("ttid");
        String body = request.getParameter("body");
        
        System.out.println("Comment Servlet tt : " + tt);
        HttpSession s = request.getSession(false);
        User user = null;
        if(s.getAttribute("user") != null){
            user = (User) s.getAttribute("user");
        }
        try{
            int id = Integer.parseInt(tt);
            User u = User.getProfile(user.getUserNo());
            Comment c = new Comment();
            c.setCommentTime(new Date(System.currentTimeMillis()));
            Comment.postComment(id , body, c, u.getUserNo());
           
            Tread t = Tread.getTread(id);
            System.out.println(id);
            int tid = t.getThreadId();
            request.setAttribute("tid",tid);
        }catch(Exception e){
            System.out.println(e);
        }
       
        RequestDispatcher rd = request.getRequestDispatcher("/showThread");
	rd.forward(request, response);


// getServletContext().getRequestDispatcher("/showThread?threadId="+"threadId").forward(request, response);
        
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

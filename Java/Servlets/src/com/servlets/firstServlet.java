package com.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "firstServlet",urlPatterns = {"/firstServlet"})
public class firstServlet extends HttpServlet {
    protected void processRequested(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie=new Cookie("t1",request.getParameter("t1"));
        response.addCookie(cookie);
        response.sendRedirect("secondServlet");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequested(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequested(request,response);
    }
}

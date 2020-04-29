package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = {"/a/b/c","/sticker","/servlets"})
public class Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String text="text/html";
        response.setContentType(text);
        PrintWriter out=response.getWriter();
        out.println("<h1>Sticker<h1>");
        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));
        int k=i+j;
        out.println(String.valueOf(k));
        out.flush();
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         processRequest(request,response);
    }
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}

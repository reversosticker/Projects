package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondServlet",urlPatterns = {"/secondServlet"})
public class secondServlets extends HttpServlet {
    protected void processRequested(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        Cookie [] cookies=request.getCookies();
        for(Cookie cookie:cookies)
        {
            if(cookie.getName().equals("t1"))
                out.print(cookie.getValue());
        }
        out.print("in the second Servlets");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequested(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequested(request,response);
    }
}

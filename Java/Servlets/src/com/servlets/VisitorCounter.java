package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VisitorCounter")
public class VisitorCounter extends HttpServlet {
    public int i=0;
    public void init()
    {
        i=0;
    }
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
        i++;
        PrintWriter out=response.getWriter();
        out.println(i);
    }
}

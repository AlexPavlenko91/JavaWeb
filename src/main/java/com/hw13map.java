package com;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "hw13map", value = "/hw13map-servlet")
public class hw13map extends HttpServlet {

    public void init() {    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("indexHW13.jsp");
        requestDispatcher.forward(request,response);//метод для перехода на нашу страницу
    }

    public void destroy() {
    }
}
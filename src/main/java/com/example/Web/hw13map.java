package com.example.Web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "hw13map", value = "/hw13map-servlet")
public class hw13map extends HttpServlet {
    private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("hw13/src/indexHW13.jsp");
        requestDispatcher.forward(request,response);//метод для перехода на нашу страницу
    }

    public void destroy() {
    }
}
package hw13_jsp.Task4567;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "checkboxes_Servlet", value = "/checkboxes")
public class checkboxes_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String userName = req.getParameter("name");
        String userEmail = req.getParameter("email");
        String userPhone = req.getParameter("phone");
        String userAge = req.getParameter("age");
        String userSubscribe = req.getParameter("subscribe");


        req.setAttribute("userName", userName);
        req.setAttribute("userEmail", userEmail);
        req.setAttribute("userPhone", userPhone);
        req.setAttribute("userAge", userAge);
        req.setAttribute("userSubscribe", userSubscribe);*/
        if (req != null) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task4567Show.jsp");
            requestDispatcher.forward(req, resp);//метод для перехода на нашу страницу
        }
    }
}

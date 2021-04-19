package hw13_jsp.Task4567;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkboxes_Servlet", value = "/checkboxes")
public class checkboxes_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req != null) {
            String userName = req.getParameter("name");
            String userEmail = req.getParameter("email");
            String userPhone = req.getParameter("phone");
            String userAge = req.getParameter("age");
            String userSubscribe = req.getParameter("subscribe");
            String userGender = req.getParameter("gender");

            req.setAttribute("userName", userName);
            req.setAttribute("userEmail", userEmail);
            req.setAttribute("userPhone", userPhone);
            req.setAttribute("userAge", userAge);
            req.setAttribute("userSubscribe", userSubscribe);
            req.setAttribute("userGender", userGender);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task4567Show.jsp");
            requestDispatcher.forward(req, resp);//метод для перехода на нашу страницу
        }
    }
}

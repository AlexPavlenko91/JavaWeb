package hw13_jsp.Task3_guessNumber;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;

@WebServlet(name = "guessNum_Servlet", value = "/guess_num-servlet")
public class guessNum_Servlet extends HttpServlet {
    public int num, more = 100, less = 0;
    Random rand;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String choice = req.getParameter("guess");
        rand = new Random();
        if (Objects.equals(choice, "equals") || (choice != null && (less == more))) {
            choice = null;
            more = 100;
            less = 0;
            num = rand.nextInt((more + 1) - less) + less;
            req.setAttribute("num", num);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task3Win.html");
            requestDispatcher.forward(req, resp);
        } else if (Objects.equals(choice, "more")) {
            less = num;
        } else if (Objects.equals(choice, "less")) {
            more = num;
        }
        num = rand.nextInt((more + 1) - less) + less;
        req.setAttribute("num", num);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/task3.jsp");
        requestDispatcher.forward(req, resp);
    }
}
